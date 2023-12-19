package se.hkr.flights2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flights implements Serializable {
    private List<Flight> flights = new ArrayList<>();


    public Flights() throws Exception {
        try {
            FileInputStream file = new FileInputStream("flights.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            flights = (List<Flight>) in.readObject();
        } catch (EOFException ex) {
            ex.printStackTrace();
        }
    }


    public void serialization(Flight flight) {
        boolean exixting = false;
        for (Flight f : flights) {
            if (Objects.equals(f.flightNumber(), flight.flightNumber())) {
                exixting = true;
                try {
                    throw new FlightBookingException("Flight number already existing");

                } catch (FlightBookingException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        if (!exixting) {
            flights.add(flight);
        }
    }

    public StringBuilder searchFlight(String departure, String destination) {
        StringBuilder s = new StringBuilder();
        for (Flight f : flights) {
            if (Objects.equals(f.destination(), destination) || Objects.equals(f.departure(), departure) || (departure.isEmpty() && destination.isEmpty())) {
                s.append("Flight number : ").append(f.flightNumber()).append("\n").append("Departure City: ").append(f.departure()).append("\n").append("Destination City: ").append(f.destination()).append("\n").append("Departure Time: ").append(f.departureTime()).append("\n").append("Arrival Time: ").append(f.arrivalTime()).append("\n");
            }
        }

        return s.isEmpty() ? s.append("No matching flights") : s;
    }

    public void close() throws IOException {
        FileOutputStream fos = new FileOutputStream("flights.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(flights);
        fos.close();
        oos.close();
    }
}
