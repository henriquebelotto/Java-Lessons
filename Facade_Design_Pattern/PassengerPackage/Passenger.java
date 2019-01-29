package PassengerPackage;

public class Passenger {

    // Example of a passenger account
    private int passengerID;
    private int passengerSecCode;
    private double passengerFunds;


    public Passenger(int passengerID, int passengerSecCode, double passengerFunds) {
        this.passengerID = passengerID;
        this.passengerSecCode = passengerSecCode;
        this.passengerFunds = passengerFunds;
    }


    public int getPassengerID() {
        return passengerID;
    }

    public int getPassengerSecCode() {
        return passengerSecCode;
    }

    public double getPassengerFunds() {
        return passengerFunds;
    }

    public void setPassengerFunds(double funds){
        passengerFunds = funds;
    }

    public void setPassengerID(int passengerID) {
        this.passengerID = passengerID;
    }

    public void setPassengerSecCode(int passengerSecCode) {
        this.passengerSecCode = passengerSecCode;
    }

    @Override
    public String toString() {
        return "Passenger ID: " + Integer.toString(getPassengerID());
    }
}
