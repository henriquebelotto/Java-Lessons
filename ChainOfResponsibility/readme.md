# Chain of Responsibility Design Pattern

#### Created to demonstrate how the Chain of Responsibility (COR) Design pattern works

#### Created by Henrique Belotto
February 12, 2019

By using the Chain of Responsibility pattern, it is possible to create a chain of objects that examine a request.
Each object verify whether it is capable of handle the request, if it is, it handle the request. 
Otherwise, it passes the request to the next object in the chain.

Each class that is part of the COR must implement a defined interface.

For this example, it is considered a case of withdraw from an ATM machine.
The user enters the amount that he/she wants to withdraw and, then, each cash dispenserChain ($50, $20 and $10 dollar bill dispenserChain)
will handle the request or pass it along the chain of responsibility.
If the user enters a number that is not multiple of 10, the ATM machine will return an error to the user


Classes:
* Tester (main class)
* Currency (used to set the amount entered by the user)
& DispenserChain (interface that all dispenser must implement)
* DispenseChain50Dollar, DispenserChain20Dollar, DispenserChain10Dollar (classes that implement the DispenserChain interface)
* ATM (holds the order of the chain of responsibility )

References:
Head First - Design Pattern
by Eric Freeman, Elisabeth Robson, Bert Bates, Kathy Sierra

JournalDev - Chain of Responsibility Design Pattern in Java