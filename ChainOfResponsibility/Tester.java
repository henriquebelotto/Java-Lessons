/*
Example created to demonstrate how the Chain of Responsibility Design Pattern works

Created by Henrique Belotto
February 12, 2019

References:
Head First - Design Pattern
by Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

JournalDev - Chain of Responsibility Design Pattern in Java

 */

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        ATM atm = new ATM();

        boolean repeat = true;
        do{
            String amount;
            System.out.println("\nEnter the amount to dispense or type \"exit\" to stop");
            Scanner input = new Scanner(System.in);
            amount = input.next();
            if (!amount.equalsIgnoreCase("exit")){
                try{
                    if(Integer.parseInt(amount) % 10 != 0){
                        // The amount entered is not multiple of 10
                        System.out.println("\nThe amount must be multiple of 10");
                    } else {
                        atm.getDispenserChain().dispense(new Currency(Integer.parseInt(amount)));
                    }
                } catch (NumberFormatException ex){
                    System.out.println("Invalid input, try again");
                }

            } else {
                // user entered "Exit", stop the loop
                repeat = false;
            }



        } while (repeat);

    }
}
