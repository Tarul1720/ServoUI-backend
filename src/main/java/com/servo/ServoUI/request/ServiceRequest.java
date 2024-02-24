package com.servo.ServoUI.request;

public class ServiceRequest {

    String serviceName;

    String shortDesc;

    String imgUrl;


    public String getServiceName() {
        return serviceName;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getImgUrl() {
        return imgUrl;
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

    public ServiceRequest() {
    }

    public ServiceRequest(String serviceName, String shortDesc, String imgUrl) {
        this.serviceName = serviceName;
        this.shortDesc = shortDesc;
        this.imgUrl = imgUrl;
    }
}
