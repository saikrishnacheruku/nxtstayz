/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.nxtstayz.repository;

import java.util.*;
import com.example.nxtstayz.model.Hotel;
import com.example.nxtstayz.model.Room;

public interface RoomRepository {
    List<Room> getRooms();

    Room getRoomById(int roomId);

    Room addRoom(Room room);

    Room updateRoom(int roomId, Room room);

    void deleteRoom(int roomId);

    Hotel getHotelByRoomId(int roomId);
}