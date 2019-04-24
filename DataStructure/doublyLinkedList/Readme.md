# Doubly Linked List

A Doubly Linked List contains a collection of Nodes. 
Each node has a pointer to the previous node and the next node

The class DoublyLinkedList *extends* AbstractCollection<T> and *implements* Iterable<T>

Also this list keeps track of the headNode (first node) and tailNode (last node)
The headNode has null as "previousNode", while the tailNode has null as "nextNode"

A Doubly Linked List is a linear data structure, like an Array. However, instead of storing elements
at contiguous location, the elements are linked using pointers (previousNode, nextNode).

Advantages over arrays:
* Dynamic size. An array has a fixed size, on the other hand, Linked List can grow or shrink at runtime;
* Ease of insertion/deletion of elements. An insertion or deletion is just a matter of changing the pointers.
In an array, it would require to recreate the whole array to make space (or remove space);

Disadvantages over arrays:
* Random access is not allowed. You cannot access a node just by using its index, like an Array;
* Requires extra memory for pointers with each node;
* Each node's memory location is spread in the memory, while an array elements are stored contiguously. 



