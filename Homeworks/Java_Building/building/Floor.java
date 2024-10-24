package Java_Building.building;

import Java_Building.building.rooms.Room;
import Java_Building.building.utilities.RoomType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Floor {
    private int floorNumber;
    private List<Room> rooms = new ArrayList<>();

    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Floor " + floorNumber + ":\n");
        Map<RoomType, Integer> roomCount = new HashMap<>();
        for (Room room : rooms) {
            roomCount.put(room.getType(), roomCount.getOrDefault(room.getType(), 0) + 1);
        }
        for (RoomType type : roomCount.keySet()) {
            sb.append(roomCount.get(type) + " " + type + "s\n");
        }
        int index = 1;
        for (Room room : rooms) {
            sb.append(room.getType() + " " + index + ":\n");
            sb.append(room);
            index++;
        }
        return sb.toString();
    }
}
