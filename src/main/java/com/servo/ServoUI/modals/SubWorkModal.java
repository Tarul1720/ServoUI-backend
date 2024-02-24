package com.servo.ServoUI.modals;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="subwork")

public class SubWorkModal {
    //Id, NameSubWork, ShortDec, Price, WorkId
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Id")
    int id;
    @Column(name="NameSubWork")
    String name;
    @Column(name = "ShortDec")
    String shortDec;

    @Column(name="Price")
    int price;

    @ManyToOne
    @JoinColumn(name="work_with", nullable=false)
    private WorkModal work;

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

    public WorkModal getWork() {
        return work;
    }

    public void setWork(WorkModal user) {
        this.work = user;
    }

    public SubWorkModal(int id, String name, String shortDec, int price, WorkModal user) {
        this.id = id;
        this.name = name;
        this.shortDec = shortDec;
        this.price = price;
        this.work = user;
    }

    public SubWorkModal() {
    }
}
