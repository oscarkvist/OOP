package se.hkr.flights2;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private final List<Passenger> passengers = new ArrayList<>();

    public void setPassengers(Passenger passenger){
        passengers.add(passenger);
    }
}
