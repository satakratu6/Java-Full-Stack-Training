package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingServiceI {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> getAllBookings() {
        return (List<Booking>) bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(int bookingId) {
        return bookingRepository.findById(bookingId).orElse(null);
    }

    @Override
    public Booking updateBooking(int bookingId, Booking booking) {
        booking.setBooking_id(bookingId);
        return bookingRepository.save(booking);
    }

    @Override
    public void deleteBooking(int bookingId) {
        bookingRepository.deleteById(bookingId);
    }
}