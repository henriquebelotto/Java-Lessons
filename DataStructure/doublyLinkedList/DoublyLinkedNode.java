package doublyLinkedList;// CPAN-255 - Assignment 1
// Student Name: Henrique R Belotto
// Student Number: N01245990

public class DoublyLinkedNode <T> {
    private DoublyLinkedNode<T> nextNode;
    private DoublyLinkedNode<T> previousNode;
    private T nodeData;

    public DoublyLinkedNode(T nodeData){
        this.nodeData = nodeData;
    }

    public DoublyLinkedNode<T> getNextNode(){
        return this.nextNode;
    }

    public DoublyLinkedNode<T> getPreviousNode(){
        return this.previousNode;
    }

    public void setNextNode(DoublyLinkedNode<T> nextNode){
        this.nextNode = nextNode;
    }

    public void setPreviousNode(DoublyLinkedNode<T> previousNode) {
        this.previousNode = previousNode;
    }

    public T getNodeData(){
        return this.nodeData;
    }

    public void setNodeData(T nodeData){
        this.nodeData = nodeData;
    }
}
