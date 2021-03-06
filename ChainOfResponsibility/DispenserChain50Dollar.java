/*
Example created to demonstrate how the Chain of Responsibility Design Pattern works

Created by Henrique Belotto
February 12, 2019

References:
Head First - Design Pattern
by Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

JournalDev - Chain of Responsibility Design Pattern in Java

 */

public class DispenserChain50Dollar implements DispenserChain {

    private DispenserChain dispenserChain;

    @Override
    public void nextDispenser(DispenserChain nextDispenser) {
        this.dispenserChain = nextDispenser;
    }


    @Override
    public void dispense(Currency currency) {
        if( currency.getAmount() >= 50 ){
            // The amount is higher than $50, verify how many notes the dispenser can dispense and sent the
            // remainder to the next dispenser
            int numOfNotes = currency.getAmount() / 50;
            System.out.printf("\nDispensing " + numOfNotes + " of $50 note");

            int remainder = currency.getAmount() % 50;
            if(remainder != 0)
                this.dispenserChain.dispense(new Currency(remainder));

        } else {
            // This dispenser cannot handle the request, invoke the next dispenser
            this.dispenserChain.dispense(currency);
        }
    }
}
