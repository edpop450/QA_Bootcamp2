package Java_Building.building.rooms;

import lombok.Getter;
import Java_Building.building.utilities.RoomType;
import Java_Building.building.utilities.Appliance;
import Java_Building.building.utilities.Furniture;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public abstract class Room {
    @Getter
    protected RoomType type;
    protected Map<Furniture, Integer> furniture = new HashMap<>();
    protected List<Appliance> appliances = new ArrayList<>();

    public Room(RoomType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(type + ":\n");
        if (!furniture.isEmpty()) {
            sb.append("  Furniture:\n");
            for (Map.Entry<Furniture, Integer> entry : furniture.entrySet()) {
                sb.append("       " + entry.getKey() + "  " + entry.getValue() + "\n");
            }
        }
        if (!appliances.isEmpty()) {
            sb.append("  Appliances:\n");
            for (Appliance app : appliances) {
                sb.append("       " + app + "\n");
            }
        }
        return sb.toString();
    }
}
