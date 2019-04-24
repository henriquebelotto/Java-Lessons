package doublyLinkedList;

import java.util.*;

/*
    This class implements a Doubly Linked List
    A doubly linked list is a collection of nodes that each one of them points to the previous and next node in the list

    The first node (head) has a null value as previousNode, while the last node (tailNode) has the next node as null
 */

public class DoublyLinkedList <T> extends AbstractCollection<T> implements Iterable<T> {

    // First node of the list
    // headNode has "Null" as previousNode
    private DoublyLinkedNode<T> headNode;

    // Last node of the list
    // tailNode has "null" as nextNode
    private DoublyLinkedNode<T> tailNode;
    private int count;

    // Method to add a node in the first position (as a headNode)
    public void addFirst(T nodeData){

        // creating a reference in memory to the "current" headNode - This reference is called tempNode
        DoublyLinkedNode<T> tempNode = headNode;

        // instantiating a new headNode using the given nodeData - New object in memory
        headNode = new DoublyLinkedNode<>(nodeData);

        // Setting the nextNode for the new headNode, which was created above, to
        // point to the former headNode (referred in memory as tempNode)
        headNode.setNextNode(tempNode);

        // increase the number of nodes;
        count++;
        if(count == 1){
            // Just one node, so head and tail nodes are the same
            tailNode = headNode;
        } else {
            // setting the previousNode for the former headNode (called as tempoNode here)
            // because it's just a reference in memory, the former headNode still exist in memory
            // the information will be kept, although tempNode is a temporary variable;
            tempNode.setPreviousNode(headNode);
        }
    }

    //Method to Add a new node at the end of the list (a new tailNode)
    public void addLast(T nodedata){

        // creating a reference in memory to the current tailNode
        DoublyLinkedNode<T> tempNode = tailNode;

        // instantiating a new tailNode in memory using the given nodeData
        tailNode = new DoublyLinkedNode<>(nodedata);

        // setting the previousNode for the new tailNode, which was created above, as the former tailNode
        tailNode.setPreviousNode(tempNode);

        count++;
        if(count==1){
            // just one node, so head and tail nodes are the same
             headNode = tailNode;
        } else {
            // setting the nextNode from the "former tailNode" (stored as tempNode)
            tempNode.setNextNode(tailNode);
        }

    }

    // Method to remove the current headNode
    public void removeFirst(){
        if (count != 0){
            // At least one element was added

            // Changing the reference in memory to the headNode as the nextNode
            headNode = headNode.getNextNode();
            // decreasing the counter
            count--;
            if (count == 0){
                // no element added
                tailNode = null;
                // don't need to set the headNode = null because it was set above on the getNextNode
            } else {
                // has at least 1 element

                // setting the previousNode of the headNode as null
                headNode.setPreviousNode(null);
            }

        }
    }

    // Method to remove the current tailNode
    public void removeLast(){
        if(count == 1){
            // has 1 element

            // after removing, the tail and head goes back to null
            headNode = null;
            tailNode = null;
            count--;
        } else {
            tailNode.getPreviousNode().setNextNode(null);
            tailNode = tailNode.getPreviousNode();
            count--;
        }

    }

    // Method to get the headNode
    public DoublyLinkedNode<T> getHeadNode(){
        return headNode;
    }

    // Method to get the tailNode
    public DoublyLinkedNode<T> getTailNode(){
        return tailNode;
    }

    // Method to get the number of nodes in the list
    public int getCount(){
        return count;
    }

    // Method to iterate throughout the list
    @Override
    public Iterator<T> iterator() {

        Iterator<T> iterator = new Iterator<T>() {
            DoublyLinkedNode<T> iteratorNode = headNode;
            DoublyLinkedNode<T> currentNode = headNode;

            @Override
            public boolean hasNext() {
                if(iteratorNode != null){

                    currentNode = iteratorNode;
                    iteratorNode = iteratorNode.getNextNode();
                    return true;
                } else {
                    return false;
                }

            }

            @Override
            public T next() {
                return  currentNode.getNodeData();
            }
        };

        return iterator;
    }

    // Implementing methods from the AbstractCollection Class

    @Override
    public int size() {
        return getCount();
    }

    @Override
    public boolean isEmpty() {
        if (getCount() != 0){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        // iterate through the List searching for the object o
        for(T object :this){
            if(object.equals(o) ){
                return true;
            } else{
                return false;
            }
        }
        // If it finish the loop without returning any result
        return false;
    }

    @Override
    public void clear() {
        headNode = null;
        tailNode = null;
        count = 0;
    }

    @Override
    public boolean add(T t) {
        this.addFirst(t);
        return true;
    }
}
