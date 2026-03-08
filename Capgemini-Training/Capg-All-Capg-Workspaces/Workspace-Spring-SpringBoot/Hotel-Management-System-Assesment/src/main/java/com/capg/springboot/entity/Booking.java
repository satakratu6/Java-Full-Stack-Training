package com.capg.springboot.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
@Table(name="booking")
public class Booking {

    @Id
    private int booking_id;

    private String customer_name;

    private String customer_phone;

    private LocalDate check_in_date;

    private LocalDate check_out_date;

    @ManyToOne
    @JoinColumn(name="room_id")
    
//    @JsonBackReference is a Jackson annotation used to prevent infinite recursion during JSON serialization when two entities have a bidirectional relationship.
//
//    It is commonly used in Spring Boot + JPA when two classes reference each other.
    
    @JsonBackReference
    private Room room;

    public Booking() {}

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(String customer_phone) {
        this.customer_phone = customer_phone;
    }

    public LocalDate getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(LocalDate check_in_date) {
        this.check_in_date = check_in_date;
    }

    public LocalDate getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(LocalDate check_out_date) {
        this.check_out_date = check_out_date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}