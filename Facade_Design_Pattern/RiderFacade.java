// The Facade Design Pattern decouples or separates the client
// from all of the sub components
// The Facades aim is to simplify interfaces so you don't have
// to worry about what is going on under the hood


import DriverPackage.Driver;
import PassengerPackage.*;
import RidePackage.Ride;

public class RiderFacade {

    private Driver driver;
    private Passenger passenger;
    private WelcomePassenger welcomePassenger;
    private PassengerFundCheck passengerFundChecker;
    private PassengerIDCheck passengerIDChecker;
    private PassengerRequestRide passengerRequestRide;
    private PassengerSecCodeCheck passengerSecCodeChecker;
    private Ride ride;

    // Traditional constructor
//    public RiderFacade(Driver driver, Passenger passenger){
//        this.driver = driver;
//        this.passenger = passenger;
//        welcomePassenger = new WelcomePassenger();
//
//        passengerFundChecker = new PassengerFundCheck(passenger);
//        passengerIDChecker = new PassengerIDCheck(passenger);
//        passengerSecCodeChecker = new PassengerSecCodeCheck(passenger);
//    }


    // Using a constructor based on the book
    // Effective Java - 2nd Edition - Page 14
    private RiderFacade(Builder build){
        this.driver = build.driver;
        this.passenger = build.passenger;
        welcomePassenger = build.welcomePassenger;

        passengerFundChecker = build.passengerFundChecker;
        passengerIDChecker = build.passengerIDChecker;
        passengerSecCodeChecker = build.passengerSecCodeChecker;
    }

    public void requestRide(double rideCost, int passengerID, int passengerSecCode){

        if((passengerIDChecker.getPassengerID() == passengerID) && (passengerSecCodeChecker.isCorrectCode(passengerSecCode))
        && passengerFundChecker.haveEnoughFunds(rideCost)){
            // Correct ID, security code and enough money available in the account

            passengerRequestRide = new PassengerRequestRide(passenger,driver);
            passengerFundChecker.decreaseFunds(rideCost);

        } else {
            // One of the provided information is not correct
            System.out.println("Sorry, we could not request your ride");
        }

    }

    public void checkBalance(){
        System.out.println("Funds available in your account: " + passengerFundChecker.getFundsAvailable());
    }

    public void addFunds(double funds){
        passengerFundChecker.increaseFunds(funds);
        System.out.println("The amount of " + Double.toString(funds) + " was added to your account");
    }


    // Builder class used to construct the RiderFacade class
    // Using a constructor based on the book
    // Effective Java - 2nd Edition - Page 14
    public static class Builder {
        private Driver driver;
        private Passenger passenger;
        private WelcomePassenger welcomePassenger;
        private PassengerFundCheck passengerFundChecker;
        private PassengerIDCheck passengerIDChecker;
        private PassengerSecCodeCheck passengerSecCodeChecker;

        public Builder(){
            passenger = new Passenger(0,0,0);
            driver = new Driver(0);
            welcomePassenger = new WelcomePassenger();
            passengerFundChecker = new PassengerFundCheck(passenger);
            passengerIDChecker = new PassengerIDCheck(passenger);
            passengerSecCodeChecker = new PassengerSecCodeCheck(passenger);
        }

        public Builder driverID(int driverID){
            driver.setDriverID(driverID);
            return this;
        }

        public Builder passengerID(int passengerID){
            passenger.setPassengerID(passengerID);
            return this;
        }

        public Builder passengerSecCode(int passengerSecCode){
            passenger.setPassengerSecCode(passengerSecCode);
            return this;
        }

        public Builder passengerFunds(int passengerFunds){
            passenger.setPassengerFunds(passengerFunds);
            return this;
        }

        public RiderFacade build(){
            return new RiderFacade(this);
        }


    }




}
