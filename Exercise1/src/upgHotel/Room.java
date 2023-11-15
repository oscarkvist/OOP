package upgHotel;

public class Room {
    private final int roomNumber;
    private final String roomType;
    private final double roomPrice;

    private boolean availability;

    public Room(int roomNumber, String roomType, double roomPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.availability = true;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public boolean isAvailability() {
        return availability;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean checkAvailability() {
        return false;
    }

    public void bookRoom(Hotel hotel, int room) {
        availability = false;
    }

    public void displayRoom() {
        System.out.println("Room " + roomNumber + "-" + roomType);


    }
}
