package Java_Building.building;

import Java_Building.building.rooms.ConferenceRoom;
import Java_Building.building.rooms.Kitchen;
import Java_Building.building.rooms.OfficeSpace;
import Java_Building.building.rooms.Toilet;

public class Main {
    public static void main(String[] args) {
        // Create a building
        Building building = new Building("Central");

        // First floor
        Floor firstFloor = new Floor(1);
        firstFloor.addRoom(new OfficeSpace(20));
        firstFloor.addRoom(new Toilet());
        firstFloor.addRoom(new Toilet());
        firstFloor.addRoom(new Kitchen());
        firstFloor.addRoom(new ConferenceRoom(10, false, false));
        firstFloor.addRoom(new ConferenceRoom(10, false, false));
        firstFloor.addRoom(new ConferenceRoom(10, false, false));

        // Second floor
        Floor secondFloor = new Floor(2);
        secondFloor.addRoom(new OfficeSpace(10));
        secondFloor.addRoom(new OfficeSpace(10));
        secondFloor.addRoom(new Toilet());
        secondFloor.addRoom(new Toilet());
        secondFloor.addRoom(new Kitchen());
        secondFloor.addRoom(new ConferenceRoom(8, false, false));
        secondFloor.addRoom(new ConferenceRoom(8, false, false));
        secondFloor.addRoom(new ConferenceRoom(8, false, false));
        secondFloor.addRoom(new ConferenceRoom(8, false, false));

        // Third floor
        Floor thirdFloor = new Floor(3);
        thirdFloor.addRoom(new Toilet());
        thirdFloor.addRoom(new Toilet());
        thirdFloor.addRoom(new ConferenceRoom(30, true, true));
        thirdFloor.addRoom(new ConferenceRoom(10, false, true));
        thirdFloor.addRoom(new ConferenceRoom(10, false, true));
        thirdFloor.addRoom(new ConferenceRoom(10, false, true));
        thirdFloor.addRoom(new ConferenceRoom(10, false, true));
        thirdFloor.addRoom(new ConferenceRoom(20, true, true));

        // Add floors to the building
        building.addFloor(firstFloor);
        building.addFloor(secondFloor);
        building.addFloor(thirdFloor);

        System.out.println(building);
    }
}
