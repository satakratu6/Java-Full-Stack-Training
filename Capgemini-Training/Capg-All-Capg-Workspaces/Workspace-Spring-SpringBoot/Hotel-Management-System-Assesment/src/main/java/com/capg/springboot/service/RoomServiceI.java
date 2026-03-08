package com.capg.springboot.service;

import java.util.List;
import com.capg.springboot.entity.Room;

public interface RoomServiceI {

    Room createRoom(Room room);

    List<Room> getAllRooms();

    Room getRoomById(int roomId);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);
}