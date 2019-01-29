package PassengerPackage;

public class PassengerSecCodeCheck {

    private Passenger passenger;

    // Account to check if the provided password is correct
    public PassengerSecCodeCheck(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getPassengerSecCode() {
        return passenger.getPassengerSecCode();
    }

    public boolean isCorrectCode(int passengerSecCode){
        if (passengerSecCode == getPassengerSecCode()){
            return true;
        } else {
            return false;
        }
    }

}
