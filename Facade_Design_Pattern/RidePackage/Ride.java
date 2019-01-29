package RidePackage;

import DriverPackage.Driver;
import PassengerPackage.Passenger;

public class Ride {

    private int rideID;
    private Passenger passenger;
    private Driver driver;

    // to generate a random number
    private int max = 9999;
    private int min = 1000;

    public Ride(Passenger passenger, Driver driver) {
        this.rideID = (int)(Math.random() * ((max - min) + 1)) + min;
        this.passenger = passenger;
        this.driver = driver;
    }

    public int getRideID() {
        return rideID;
    }

    @Override
    public String toString() {
        return "Your ride has been requested: " +
                "rideID= " + getRideID() + ", " + passenger + ", " + driver;
    }
}
