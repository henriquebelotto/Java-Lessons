package stack;

import doublyLinkedList.DoublyLinkedList;

import java.util.AbstractCollection;
import java.util.Iterator;


/*
    This class implements a Stack data structure.
    A Stack data structure follows the "Last-In-First-Out" methodology, i.e. the last element stored in the stack
    will be first element removed from the stack.

    This class use the Object Adapter pattern, using a doubly linked list object, to implement the stack
 */
public class Stack<T> extends AbstractCollection<T> implements Iterable<T>{


    // using an object adapter
    private DoublyLinkedList<T> doublyLinkedList;

    public Stack(){
        doublyLinkedList = new DoublyLinkedList<>();
    }

    // Push method - Add an item to the top of the stack
    public void push(T nodeData){
        doublyLinkedList.addFirst(nodeData);
    }

    // Pop– Removes an item from the top of the stack and return the value
    public T pop() {
        T tempData = doublyLinkedList.getHeadNode().getNodeData();
        doublyLinkedList.removeFirst();

        return tempData;
    }

//    Peek – Returns the value of the top item in the stack
    public T peek(){
        return doublyLinkedList.getHeadNode().getNodeData();
    }

//    Count property as a read only property that returns the number of item in the stack
    public int count(){
        return doublyLinkedList.getCount();
    }

    // implementing Iterable
    @Override
    public Iterator<T> iterator() {

        return doublyLinkedList.iterator();
    }

    // Extending AbstractCollection class
    @Override
    public int size() {

        return count();
    }

    // Extending AbstractCollection class
    @Override
    public boolean add(T t) {
        this.push(t);
        return true;
    }
}
