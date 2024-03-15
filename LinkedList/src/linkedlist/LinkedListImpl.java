/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Cifer
 */
public class LinkedListImpl {

    Node head;
   
    //Sorting
//    Node tmp = head, nextPos = null;
//        while (tmp != null) {
//            nextPos = tmp.next;
//            while (nextPos != null) {
//                if (tmp.info.weight > nextPos.info.weight) {
//                    Lion temp = tmp.info;
//                    tmp.info = nextPos.info;
//                    nextPos.info = temp;
//                }
//                nextPos = nextPos.next;
//            }
//            tmp = tmp.next;
//        }
    public LinkedListImpl insert(LinkedListImpl list, int data) {
        Node newNode = new Node(data);

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

        return list;
    }
    int count = 0;
    
    void addFirst(int data) {
        //You should write here appropriate statements to complete this function. 
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
        count++;
    }

    void addBeforeLast(int data) {
        //You should write here appropriate statements to complete this function. 
        int innerCount = 0;
        Node newNode = new Node(data);
        Node last = head;
        while (innerCount < count - 2) {
            last = last.next;
            innerCount++;
        }
        newNode.next = last.next;
        last.next = newNode;
    }

    public LinkedListImpl delete(LinkedListImpl list, int key) {
        Node currentNode = list.head, prevNode = null;

        System.out.println("");
        //Do not have any traversal, and the key to delete = head
        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            System.out.println(key + " found and deleted");
            return list;
        }

        //Other condition:
        while (currentNode != null && currentNode.data != key) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        //If there is any key, the loop will stop earlier so the node != null
        if (currentNode != null) {
            prevNode.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }

        //Last: The key is not found
        if (currentNode == null) {
            // Display the message
            System.out.println(key + " not found");
        }

        // return the List
        return list;
    }

    public LinkedListImpl deleteAtPosition(LinkedListImpl list, int position) {
        Node currentNode = list.head, prevNode = null;
        System.out.println("");

        //Case 1: position = 0
        if (currentNode != null && position == 0) {
            list.head = currentNode.next;
            System.out.println(position + " position element deleted");
            return list;
        }

        //Case 2: position > 0 and it's valid
        int count = 0;
        while (currentNode != null) {
            if (count == position) {
                prevNode.next = currentNode.next;
                System.out.println(position + " position element deleted");
                break;
            } else {
                prevNode = currentNode;
                currentNode = currentNode.next;
                count++;
            }
        }

        if (currentNode == null) {
            // Display the message
            System.out.println(
                    position + " position element not found");
        }

        // return the List
        return list;
    }

    public void traversalLinkedList(LinkedListImpl list) {
        Node currentNode = list.head;
        System.out.println("Linked List: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
