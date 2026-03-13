package com.capg.appointment.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="DOCTOR-SERVICE")
public interface DoctorClient {
	@GetMapping("/doctor/check/{doctorId}")
    boolean isDoctorAvailable(@PathVariable("doctorId") Long doctorId);
}
