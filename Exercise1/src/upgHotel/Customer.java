package upgHotel;
public class Customer {
    private final String name;
    private final Room[] reservations;
    private int numRes;

    public Customer(String name) {
        this.name = name;
        reservations = new Room[5];
        this.numRes = 0;
    }

    public void bookRoom(Hotel hotel, int roomNumber) {
        Room room = hotel.getRooms(roomNumber);
        if (room != null && room.isAvailability()) {
            room.bookRoom(hotel, roomNumber);
            reservations[numRes] = room;
            numRes++;
            System.out.println("Room " + roomNumber + " booked for " + name);
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }
    public void displayReservations() {
        System.out.println("Reservations for " + name + ":");
        for (int i = 0; i < numRes; i++) {
            reservations[i].displayRoom();
        }
    }

}
