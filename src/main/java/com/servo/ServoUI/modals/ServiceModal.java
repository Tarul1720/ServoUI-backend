package com.servo.ServoUI.modals;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="service")

public class ServiceModal {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "Id")
    int id;

    @Column(name="ServiceName")
    String serviceName;
    @Column(name="ShortDesc")
    String shortDesc;
    @Column(name="ImageURL")
    String imgUrl;

    public int getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }


    public String getShortDesc() {
        return shortDesc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public ServiceModal() {
    }

    public ServiceModal(int id, String serviceName, String shortDesc, String imgUrl) {
        this.id = id;
        this.serviceName = serviceName;
        this.shortDesc = shortDesc;
        this.imgUrl = imgUrl;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }


}
