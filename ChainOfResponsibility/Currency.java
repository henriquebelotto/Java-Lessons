/*
Example created to demonstrate how the Chain of Responsibility Design Pattern works

Created by Henrique Belotto
February 12, 2019

References:
Head First - Design Pattern
by Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

JournalDev - Chain of Responsibility Design Pattern in Java

 */

public class Currency {
    private int amount;

    public Currency(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
