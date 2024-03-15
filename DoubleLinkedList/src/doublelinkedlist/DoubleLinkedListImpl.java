/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

import doublelinkedlist.Node;

/**
 *
 * @author KhoaPC
 */
public class DoubleLinkedListImpl {

    private Node tail;
    private Node head;

    public DoubleLinkedListImpl() {
        this.tail = null;
        this.head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void addToHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addToTail(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void addToPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Invalid position. Position must be greater than 0.");
            return;
        }

        Node newNode = new Node(data);

        if (position == 0) {
            // Insertion at the front of the list
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        Node currentNode = head;
        int currentPosition = 0;

        //Loop until the node at the right position founded
        while (currentPosition < position -1 && currentNode != null) {
            currentNode = currentNode.next;
            currentPosition++;
        }

        if (currentNode == null) {
            System.out.println("The position should <= the list's length");
            return;
        }

        newNode.next = currentNode.next;
        if (currentNode.next != null) {
            currentNode.next.prev = newNode;
        }
        currentNode.next = newNode;
        newNode.prev = currentNode;

        if (currentNode == tail) {
            tail = newNode;
        }
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;   //head is the front, 
            //This will define the head pointer to the next element of it.
            head.prev = null;   //Cut the head from the Linked list
        }
    }

    public void removeTail() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;   //Tail is the back,
            //This will define the tail pointer to the previous element of it.
            tail.next = null;   //Then we will cut the old tail from the linked list
        }
    }

    public void removeAtPosition(int position) {
        if (isEmpty()) {
            System.out.println("List is empty. Cannot remove from an empty list.");
            return;
        }

        if (position < 0) {
            System.out.println("Invalid position. Position must be greater than 0.");
            return;
        }

        if (position == 0) {
            // Removal from the front of the list
            if (head == tail) {
                // Only one node in the list
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node current = head;
        int currentPosition = 0;

        while (currentPosition < position && current != null) {
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Invalid position. The list is not long enough.");
            return;
        }

        if (current == tail) {
            // Removal from the end of the list
            tail = tail.prev;
            tail.next = null;
        } else {
            // Removal from the middle of the list
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
