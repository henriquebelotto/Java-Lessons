public class Tester {

    public static void main(String[] args){


        /* The methods and classes created to this example are excessive complex (some unnecessary classes and methods)
        This was done intentionally to display how a facade can help to simplify the interface between the client (user)
        and the implementation of a class */

        // Using the constructor as showed in the book Effective Java - 2nd Edition
        RiderFacade riderFacade = new RiderFacade.Builder()
                .driverID(999)
                .passengerID(1234)
                .passengerFunds(100)
                .passengerSecCode(6666)
                .build();


        riderFacade.checkBalance();


        riderFacade.requestRide(50,1234,6666);

        riderFacade.checkBalance();

        System.out.println("\nTesting with wrong security code");
        riderFacade.requestRide(10,1234,1111);

        System.out.println("\nTesting with wrong passengerID code");
        riderFacade.requestRide(10,4321,5555);

        System.out.println("\nTesting with not enough funds");
        riderFacade.requestRide(60,1234,6666);

        System.out.println("\nUsing addFunds");
        riderFacade.addFunds(60);

        System.out.println("\nBalance after adding funds");
        riderFacade.checkBalance();



    }

}
