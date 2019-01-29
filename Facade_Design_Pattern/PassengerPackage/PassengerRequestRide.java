package PassengerPackage;

import DriverPackage.Driver;
import RidePackage.Ride;

public class PassengerRequestRide {
    Ride ride;

    // Imagine that this class would have to check a bunch of other factors before creating a ride
    public PassengerRequestRide(Passenger passenger, Driver driver) {
        this.ride = new Ride(passenger,driver);

        System.out.println(ride.toString());
    }

}
