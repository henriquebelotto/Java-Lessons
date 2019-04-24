#Queue

A Queue data structure follows the **"First-In-First-Out"** methodology, i.e., the first
element added to the queue will be the first element removed from the queue

This class use an **Object Adapter** Design pattern to implement a Queue by wrapping a Doubly Linked List object
inside the Queue constructor. Also, all the Queue methods, such as enqueue and dequeue, are implemented
using the methods already implemented in the doubly linked list