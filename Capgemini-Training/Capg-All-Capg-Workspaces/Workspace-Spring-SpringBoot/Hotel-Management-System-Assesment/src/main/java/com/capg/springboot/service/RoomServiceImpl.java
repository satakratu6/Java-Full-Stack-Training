package com.capg.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Room;
import com.capg.springboot.repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomServiceI {

    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public List<Room> getAllRooms() {
        return (List<Room>) roomRepository.findAll();
    }

    @Override
    public Room getRoomById(int roomId) {
        return roomRepository.findById(roomId).orElse(null);
    }

    @Override
    public Room updateRoom(int roomId, Room room) {
        room.setRoom_id(roomId);
        return roomRepository.save(room);
    }

    @Override
    public void deleteRoom(int roomId) {
        roomRepository.deleteById(roomId);
    }
}