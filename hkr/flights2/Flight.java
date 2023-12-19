package se.hkr.flights2;

import java.io.*;


public record Flight(String destination, String departure, String flightNumber, String departureTime,
                     String arrivalTime) implements Serializable {

}
