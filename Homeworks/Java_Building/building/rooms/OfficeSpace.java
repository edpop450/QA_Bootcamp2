package Java_Building.building.rooms;

import Java_Building.building.utilities.RoomType;
import Java_Building.building.utilities.Furniture;

public class OfficeSpace extends Room {
    public OfficeSpace(int numDesks) {
        super(RoomType.Office_space);
        furniture.put(Furniture.Desk, numDesks);
    }
}
