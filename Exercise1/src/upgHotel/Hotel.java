package upgHotel;
public class Hotel {
    private final Room[] rooms;
    private int numOfRooms = 0;

    public Hotel(String hotelName) {
        rooms = new Room[100];
    }

    public Room getRooms(int roomnumber) {
        for (int i = 0; i < numOfRooms; i++) {
            if (rooms[i].getRoomNumber() == roomnumber) {
                return rooms[i];
            }
        }
        return null;
    }

    public void addRoom(Room room) {
        if (numOfRooms < rooms.length) {
            rooms[numOfRooms] = room;
            numOfRooms++;
        } else {
            System.out.println("Maximum number of rooms reched");
        }
    }

    public void displayRoomAvailability() {
        String availability = " - Occupied";
        for (int i = 0; i < numOfRooms; i++) {
            if (rooms[i].isAvailability()) {
                availability = " - Available";
            }
            System.out.println("Room " + rooms[i].getRoomNumber() + availability);
        }

    }
}