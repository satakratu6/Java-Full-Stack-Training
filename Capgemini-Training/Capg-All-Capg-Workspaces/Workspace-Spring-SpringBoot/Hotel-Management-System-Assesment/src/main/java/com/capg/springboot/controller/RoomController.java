package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capg.springboot.entity.Room;
import com.capg.springboot.service.RoomServiceI;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomServiceI service;

    @PostMapping
    public Room createRoom(@RequestBody Room room) {
        return service.createRoom(room);
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return service.getAllRooms();
    }

    @GetMapping("/{id}")
    public Room getRoomById(@PathVariable int id) {
        return service.getRoomById(id);
    }

    @PutMapping("/{id}")
    public Room updateRoom(@PathVariable int id, @RequestBody Room room) {
        return service.updateRoom(id, room);
    }

    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable int id) {
        service.deleteRoom(id);
        return "Room Deleted";
    }
}