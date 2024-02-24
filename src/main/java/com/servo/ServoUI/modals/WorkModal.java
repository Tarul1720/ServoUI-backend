package com.servo.ServoUI.modals;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "work")

public class WorkModal {
    //Id,
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Id")
    int id;

   // WorkName, ShortDesc, Cost, Image, ServicceId
    @Column(name="WorkName")
    String name;
    @Column(name = "ShortDec")
    String shortDec;

    @Column(name="Cost")
    int price;

    @Column(name = "Image")
    String image;


    @ManyToOne
    @JoinColumn(name="service_with", nullable=false)
    private ServiceModal service;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDec() {
        return shortDec;
    }

    public void setShortDec(String shortDec) {
        this.shortDec = shortDec;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ServiceModal getService() {
        return service;
    }

    public void setService(ServiceModal user) {
        this.service = user;
    }

    public WorkModal(int id, String name, String shortDec, int price, String image, ServiceModal user) {
        this.id = id;
        this.name = name;
        this.shortDec = shortDec;
        this.price = price;
        this.image = image;
        this.service = user;
    }

    public WorkModal() {
    }
}
