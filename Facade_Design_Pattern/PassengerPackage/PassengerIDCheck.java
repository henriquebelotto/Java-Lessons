package PassengerPackage;

public class PassengerIDCheck {

    private Passenger passenger;

    // Account to check if the provided ID is active
    public PassengerIDCheck(Passenger passenger){
        this.passenger = passenger;
    }

    public int getPassengerID() {
        return passenger.getPassengerID();
    }

    public boolean passengerActive(int passengerID){
        if (passengerID == getPassengerID()){
            return true;
        } else {
            return false;
        }
    }

}
