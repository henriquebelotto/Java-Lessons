package queue;

import doublyLinkedList.DoublyLinkedList;

import java.util.AbstractCollection;
import java.util.Iterator;

/*
    This class implements a Queue data structure.
    A Queue data structure follows the "first-in-first-out" methodology, i.e. the first element stored in the queue
    will be first element removed from the queue

    This class use the Object Adapter pattern, using a doubly linked list object, to implement the queue
 */
public class Queue<T> extends AbstractCollection<T> implements Iterable<T>{

    // using an object adapter
    private DoublyLinkedList<T> doublyLinkedList;

    // Using an Object Adapter Design Pattern as the constructor for the Queue
    public Queue(){
        doublyLinkedList = new DoublyLinkedList<>();
    }

    // Enqueue – Adds an item as the last item in the generic LinkedList
    public void enqueue(T nodeData){
        doublyLinkedList.addLast(nodeData);
    }

    // Dequeue – Removes the first item in the generic LinkedList and return the value
    public T dequeue(){
        T tempData = doublyLinkedList.getHeadNode().getNodeData();
        doublyLinkedList.removeFirst();

        return tempData;
    }

    // Peek – Returns the value of the first item in the linked list.
    public T peek(){
        return doublyLinkedList.getHeadNode().getNodeData();
    }

    // Count property as a read only property that returns the number of item in the queue
    public int count(){
        return doublyLinkedList.getCount();
    }


    // implementing Iterable
    @Override
    public Iterator<T> iterator() {

        return doublyLinkedList.iterator();
    }

    // Extending AbstractCollection
    @Override
    public int size() {

        return count();
    }

    // Extending AbstractCollection class
    @Override
    public boolean add(T t) {
        this.enqueue(t);
        return true;
    }
}
