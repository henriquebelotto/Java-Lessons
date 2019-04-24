import doublyLinkedList.DoublyLinkedList;
import queue.Queue;
import stack.Stack;

import java.util.Iterator;

/*
Main Class to test the doublyLinkedList.DoublyLinkedNode, queue.Queue and stack.Stack
 */
public class Main {

    public static void main(String[] args){

            // Testing doublyLinkedList.DoublyLinkedList Class

            System.out.println("\nNew List");

            // Instantiating a doubly linked list object
            DoublyLinkedList<String> ddl1 = new DoublyLinkedList<>();

            // Testing addFirst and getHead function
            ddl1.addFirst("element A");
            System.out.println("Using addLast & getHead: " + ddl1.getHeadNode().getNodeData());
            ddl1.addFirst("element B");
            System.out.println("Using addLast & getHead: " + ddl1.getHeadNode().getNodeData());
            ddl1.addFirst("element C");
            System.out.println("Using addLast & getHead: " + ddl1.getHeadNode().getNodeData());

            // Testing implementation of Iterable and Collection
            // Using For-each
            System.out.println("\nUsing a foreach (DDL), which requires that the class implement iterable");
            int count = 1;
            for(String string : ddl1){
                    System.out.println("Element #" + count + " - " + string);
                    count++;
            }

            // Testing implementation of Iterable and Collection
            // Using Iterator
            Iterator iteratorDDL = ddl1.iterator();

            System.out.println("\nUsing an Iterator with the DDL: ");
            count = 1;
            while (iteratorDDL.hasNext()){
                    System.out.println("Element #" + count + " - " + iteratorDDL.next());
                    count++;
            }

            System.out.println("________________________________________________________");
            System.out.println("\nTesting Collection methods for the DDL");
            // Testing Collection Class Methods

            // Testing Contains(Object o) method:
            String obj = "element X";
            System.out.println("Does the DDL contains the object: " + obj.toString() + " - " + ddl1.contains(obj));
            obj = "element C";
            System.out.println("Does the DDL contains the object: " + obj.toString() + " - " + ddl1.contains(obj));

            // Testing Clear() method
            DoublyLinkedList<String> ddl5 = new DoublyLinkedList<>();
            ddl5.addFirst("element A");
            ddl5.addFirst("element B");
            ddl5.addFirst("element C");
            ddl5.addFirst("element D");

            // Using the Add method from the Collection class
            ddl5.add("element Z");

            System.out.println("Testing Clear method - Current Values \nHead " + ddl5.getHeadNode().getNodeData()
                    + "\ntail" + ddl5.getTailNode().getNodeData()
                            + " \n# of nodes" + + ddl5.getCount());
            ddl5.clear();
            System.out.println("After Clear method - # of Nodes: " + ddl5.getCount());


            // Testing RemoveLast and getTail function
            System.out.println("________________________________________________________");
            System.out.println("\nTesting RemoveLast and getTail function for the DDL");
            System.out.println("\n");
            ddl1.removeLast();
            System.out.println("Using removeLast & getTail: " + ddl1.getTailNode().getNodeData());
            System.out.println("getHead: " + ddl1.getHeadNode().getNodeData());
            ddl1.removeFirst();
            System.out.println("Using removeFirst & getHead: " + ddl1.getHeadNode().getNodeData());
            System.out.println("getTail: " + ddl1.getTailNode().getNodeData());
            ddl1.removeFirst();
            System.out.println("Using removeFirst & getCount: " + ddl1.getCount());

            System.out.println("___________________________________________________________________");
            System.out.println("\nNew List");
            DoublyLinkedList<String> ddl2 = new DoublyLinkedList<>();

            // Testing addLast and getTail function
            ddl2.addLast("element Q");
            System.out.println("Using addLast & getTail: " + ddl2.getTailNode().getNodeData());
            ddl2.addLast("element W");
            System.out.println("Using addLast & getTail: " + ddl2.getTailNode().getNodeData());
            ddl2.addLast("element E");
            System.out.println("Using addLast & getTail: " + ddl2.getTailNode().getNodeData());

            System.out.println("\nUsing a foreach (DDL), which requires that the class implement iterable");
            count = 1;
            for(String string : ddl2){
                    System.out.println("Element #" + count + " - " + string);
                    count++;
            }

            // Testing RemoveFirst with only one element in the list
            System.out.println("___________________________________________________________________");
            System.out.println("\nNew List - Only one element");
            DoublyLinkedList<String> ddl3 = new DoublyLinkedList<>();
            ddl3.addLast("element Z");
            System.out.println("Using addLast & getHead: " + ddl3.getHeadNode().getNodeData());
            System.out.println("getTail: " + ddl3.getHeadNode().getNodeData());
            ddl3.removeFirst();
            System.out.println("Using removeFirst & getCount: " + ddl3.getCount());

            // Testing removeLast with only one element in the list
            System.out.println("___________________________________________________________________");
            System.out.println("\nNew List - Only one element");
            DoublyLinkedList<String> ddl4 = new DoublyLinkedList<>();
            ddl4.addFirst("element P");
            System.out.println("Using addFirst & getTail: " + ddl4.getTailNode().getNodeData());
            System.out.println("getHead: " + ddl4.getHeadNode().getNodeData());
            ddl4.removeLast();
            System.out.println("Using removeLast & getCount: " + ddl4.getCount());


            // Testing stack.Stack class
            System.out.println("___________________________________________________________________");
            // Testing stack.Stack
            Stack<String> stack = new Stack<>();
            System.out.println("\nTesting stack.Stack");
            // Adding eleements to the stack

            stack.push("element A");
            System.out.println("Using Push & Peek: " + stack.peek() + " & count: " + stack.count());

            stack.push("element B");
            System.out.println("Using Push & Peek: " + stack.peek() + " & count: " + stack.count());

            stack.push("element C");
            System.out.println("Using Push & Peek: " + stack.peek() + " & count: " + stack.count());

            // Testing method ADD from the AbstractCollection class implemented inside the stack.Stack Class
            stack.add("element D");
            System.out.println("Using Add method (AbstractCollection Class) & Peek: "
                    + stack.peek() + " & count: " + stack.count());

            // Testing implementation of Iterable and Collection
            // Using For-each
            System.out.println("\nUsing a foreach (STACK), which requires that the class implement iterable");
            count = 1;
            for(String string : stack){
                    System.out.println("Element #" + count + " - " + string);
                    count++;
            }

            // Testing implementation of Iterable and Collection
            // Using Iterator
            Iterator iteratorStack = stack.iterator();

            System.out.println("\nUsing an Iterator with the stack.Stack: ");
            count = 1;
            while (iteratorStack.hasNext()){
                    System.out.println("Element #" + count + " - " + iteratorStack.next());
                    count++;
            }


            // Testing pop method until there is no element in the queue anymore
            System.out.println("\n");
            stack.pop();
            System.out.println("Using Pop & Peek: " + stack.peek() + " & Count: " + stack.count());
            stack.pop();
            System.out.println("Using Pop & Peek: " + stack.peek() + " & Count: " + stack.count());
            stack.pop();
            System.out.println("Using Pop & Peek: " + stack.peek() + " & Count: " + stack.count());
            stack.pop();
            System.out.println("Using Pop & Count: " + stack.count());

            // Testing queue.Queue class
            System.out.println("___________________________________________________________________");
            Queue<String> queue = new Queue<>();
            System.out.println("\nTesting queue.Queue");


            queue.enqueue("Element ABC");
            System.out.println("Using enqueue & Peek: " + queue.peek() + " & count: " + queue.count());
            queue.enqueue("Element DEF");
            System.out.println("Using enqueue & Peek: " + queue.peek() + " & count: " + queue.count());
            queue.enqueue("Element GHI");
            System.out.println("Using enqueue & Peek: " + queue.peek() + " & count: " + queue.count());

            // Testing method ADD from the AbstractCollection class implemented inside the stack.Stack Class
            queue.add("element ADASDDSADASD");
            System.out.println("Using Add method (AbstractCollection Class) & Peek: "
                    + queue.peek() + " & count: " + queue.count());

            // Testing implementation of Iterable and Collection
            // Using For-each
            System.out.println("\nUsing a foreach (QUEUE), which requires that the class implement iterable");
            count = 1;
            for(String string : queue){
                    System.out.println("Element #" + count + " - " + string);
                    count++;
            }

            // Testing implementation of Iterable and Collection
            // Using Iterator
            Iterator iteratorQueue = queue.iterator();

            System.out.println("\nUsing an Iterator with the stack.Stack: ");
            count = 1;
            while (iteratorQueue.hasNext()){
                    System.out.println("Element #" + count + " - " + iteratorQueue.next());
                    count++;
            }

            System.out.println("\n");

            // Testing dequeue method until there is no element in the queue anymore
            System.out.println("Removing first Element on the queue.Queue: " + queue.dequeue() + " & count: " + queue.count());
            System.out.println("New First Element on the queue.Queue: " + queue.peek()  + " & count: " + queue.count());

            System.out.println("Removing first Element on the queue.Queue: " + queue.dequeue() + " & count: " + queue.count());
            System.out.println("New First Element on the queue.Queue: " + queue.peek()  + " & count: " + queue.count());

            System.out.println("Removing first Element on the queue.Queue: " + queue.dequeue() + " & count: " + queue.count());
            System.out.println("Removing first Element on the queue.Queue: " + queue.dequeue() + " & count: " + queue.count());


    }
}
