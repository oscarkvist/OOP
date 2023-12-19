package se.hkr.flights2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int option = 0;
        Flights flights = new Flights();
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        while (option != 6) {
            System.out.println("1. Add Flight\n" + "2. Add Passenger\n3. Book a Flight\n" + "4. Search Flights\n" + "5. View Bookings\n" + "6. Save and Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.print("Enter Flight Number: ");
                String flightNumber = scanner.next();
                System.out.print("Enter Departure City: ");
                String departure = scanner.next();
                System.out.print("Enter Destination City: ");
                String destination = scanner.next();
                scanner.nextLine();
                System.out.print("Enter Departure Time (yyyy-MM-dd HH:mm +/-HH:mm): ");
                String departureTime = scanner.nextLine();
                System.out.print("Enter Arrival Time (yyyy-MM-dd HH:mm +/-HH:mm): ");
                String arrivalTime = scanner.nextLine();
                Flight flight = new Flight(destination, departure, flightNumber, departureTime, arrivalTime);
                flights.serialization(flight);

            } else if (option == 2) {
                System.out.print("Enter name: ");
                String name = scanner.next();
                System.out.print("Enter email : ");
                String email = scanner.next();
                admin.setPassengers(new Passenger(name, email));

            } else if (option == 3) {
                System.out.println();

            } else if (option == 4) {
                System.out.print("Enter Departure City (leave blank for any): ");
                String departure = scanner.nextLine();
                System.out.print("Enter Destination City (leave blank for any): ");
                String destination = scanner.nextLine();
                System.out.println(flights.searchFlight(departure, destination));

            } else if (option == 5) {
                System.out.println();
            } else if (option == 6) {
                flights.close();
            }
        }
    }
}
