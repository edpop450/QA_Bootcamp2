package Java_Building.building.rooms;

import Java_Building.building.utilities.RoomType;
import Java_Building.building.utilities.Appliance;
import Java_Building.building.utilities.Furniture;

public class ConferenceRoom extends Room {
    public ConferenceRoom(int numSeats, boolean hasVideoProjector, boolean hasTelepresence) {
        super(RoomType.Conference_room);
        furniture.put(Furniture.Seat, numSeats);
        if (hasVideoProjector) {
            appliances.add(Appliance.Video_Projector);
        } else {
            appliances.add(Appliance.TV);
        }
        if (hasTelepresence) {
            appliances.add(Appliance.Telepresence);
        }
    }
}
