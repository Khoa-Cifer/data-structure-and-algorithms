/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author Cifer
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.insert(linkedList, 0);
        linkedList.insert(linkedList, 05);
        linkedList.insert(linkedList, 10);
        linkedList.insert(linkedList, 80);
        linkedList.insert(linkedList, 20);
        linkedList.insert(linkedList, 06);
        linkedList.insert(linkedList, 520);
        linkedList.insert(linkedList, 50);
        linkedList.insert(linkedList, 01);
        linkedList.insert(linkedList, 06);
        linkedList.insert(linkedList, 40);
        linkedList.insert(linkedList, 5);
        linkedList.traversalLinkedList(linkedList);
        linkedList.deleteAtPosition(linkedList, 2);
        linkedList.traversalLinkedList(linkedList);

    }

}
