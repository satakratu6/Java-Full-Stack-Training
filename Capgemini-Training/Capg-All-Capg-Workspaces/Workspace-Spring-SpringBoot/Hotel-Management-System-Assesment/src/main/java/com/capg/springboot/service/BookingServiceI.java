package com.capg.springboot.service;

import java.util.List;
import com.capg.springboot.entity.Booking;

public interface BookingServiceI {

    Booking createBooking(Booking booking);

    List<Booking> getAllBookings();

    Booking getBookingById(int bookingId);

    Booking updateBooking(int bookingId, Booking booking);

    void deleteBooking(int bookingId);
}