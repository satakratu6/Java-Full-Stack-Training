package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.service.BookingServiceI;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingServiceI service;

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return service.createBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return service.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable int id) {
        return service.getBookingById(id);
    }

    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable int id, @RequestBody Booking booking) {
        return service.updateBooking(id, booking);
    }

    @DeleteMapping("/{id}")
    public String cancelBooking(@PathVariable int id) {
        service.deleteBooking(id);
        return "Booking Cancelled";
    }
}