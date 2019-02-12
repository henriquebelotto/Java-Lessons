/*
Example created to demonstrate how the Chain of Responsibility Design Pattern works

Created by Henrique Belotto
February 12, 2019

References:
Head First - Design Pattern
by Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

JournalDev - Chain of Responsibility Design Pattern in Java

 */

public class ATM {
    private DispenserChain dispenserChain;

    public ATM(){
        // Initialize the chain with the $50 dollar dispenser
        this.dispenserChain = new DispenserChain50Dollar();
        DispenserChain dispenser20 = new DispenserChain20Dollar();
        DispenserChain dispenser10 = new DispenserChain10Dollar();

        // Set the next dispensers for each one of them
        dispenserChain.nextDispenser(dispenser20);
        dispenser20.nextDispenser(dispenser10);
    }

    public DispenserChain getDispenserChain(){
        return dispenserChain;
    }
}
