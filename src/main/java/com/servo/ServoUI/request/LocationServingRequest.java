package com.servo.ServoUI.request;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LocationServingRequest {

    //ServiceId,

    int serviceId;
    //Rating,

    double rating;
    //UserId,

    int userId;
    //Latitude,

    double latitude;
    //Longitude

    double longiude;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongiude() {
        return longiude;
    }

    public void setLongiude(double longiude) {
        this.longiude = longiude;
    }

    public LocationServingRequest(int serviceId, double rating, int userId, double latitude, double longiude) {
        this.serviceId = serviceId;
        this.rating = rating;
        this.userId = userId;
        this.latitude = latitude;
        this.longiude = longiude;
    }

    public LocationServingRequest() {
    }
}
