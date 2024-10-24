package Java_Building.building.rooms;

import Java_Building.building.utilities.RoomType;
import Java_Building.building.utilities.Appliance;

public class Kitchen extends Room {
    public Kitchen() {
        super(RoomType.Kitchen);
        appliances.add(Appliance.Coffee_machine);
        appliances.add(Appliance.Water_dispenser);
        appliances.add(Appliance.Fridge);
    }
}
