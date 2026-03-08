package com.capg.springboot.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.*;

@Entity
@Table(name="room")
public class Room {

    @Id
    private int room_id;

    private int room_number;

    private String room_type;

    private double price;

    private String status;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL)
    
//    @JsonManagedReference is a Jackson annotation used with @JsonBackReference to handle bidirectional relationships during JSON serialization.
//
//    It marks the parent (forward) side of the relationship.
    @JsonManagedReference
    private List<Booking> bookings;

    public Room() {}

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}