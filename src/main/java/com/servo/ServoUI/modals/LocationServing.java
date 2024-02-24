package com.servo.ServoUI.modals;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="locationserving")

public class LocationServing {
    @Id
    @Column(name="Id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;

    //ServiceId,

    //Rating,
    @Column(name="Rating")
    double rating;
    //UserId,
    @Column(name="UserId")
    int userId;
    //Latitude,
    @Column(name="Latitude")
    double latitude;
    //Longitude
    @Column(name="Longitude")
    double longiude;

    @ManyToOne
    @JoinColumn(name="service_with", nullable=false)
    private ServiceModal service;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ServiceModal getService() {
        return service;
    }

    public void setService(ServiceModal user) {
        this.service = user;
    }

    public LocationServing(int id, double rating, int userId, double latitude, double longiude, ServiceModal user) {

        this.id = id;
        this.rating = rating;
        this.userId = userId;
        this.latitude = latitude;
        this.longiude = longiude;
        this.service = user;
    }

    public LocationServing() {
    }
}
