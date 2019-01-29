package PassengerPackage;

public class PassengerFundCheck {

    private Passenger passenger;

    public PassengerFundCheck(Passenger passenger){
        this.passenger = passenger;
    }

    public double getFundsAvailable(){
        return passenger.getPassengerFunds();
    }

    public void decreaseFunds(double fundsSpent){
        passenger.setPassengerFunds(getFundsAvailable() - fundsSpent);
    }

    public void increaseFunds(double fundsAdded){
        passenger.setPassengerFunds(getFundsAvailable() + fundsAdded);
    }

    public boolean haveEnoughFunds(double rideCost){
        if (rideCost > getFundsAvailable()){

            System.out.println("Sorry, you don't have enough funds to request this ride");
            return false;
        } else {
            System.out.println("You have enough funds to request this ride");


            return true;
        }

    }

}
