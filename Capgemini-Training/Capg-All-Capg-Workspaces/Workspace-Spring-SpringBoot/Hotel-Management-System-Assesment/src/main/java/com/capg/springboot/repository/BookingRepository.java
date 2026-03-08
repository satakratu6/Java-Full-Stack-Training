package com.capg.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.capg.springboot.entity.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {

}
