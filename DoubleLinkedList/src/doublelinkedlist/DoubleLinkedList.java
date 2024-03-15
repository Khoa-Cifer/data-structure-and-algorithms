/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublelinkedlist;

/**
 *
 * @author KhoaPC
 */
public class DoubleLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoubleLinkedListImpl doubleLinkedList = new DoubleLinkedListImpl();
        doubleLinkedList.addToHead(5);
        doubleLinkedList.addToHead(5);
        doubleLinkedList.addToHead(7);
        doubleLinkedList.addToHead(2);
        doubleLinkedList.addToHead(8);
        doubleLinkedList.addToHead(7);
        doubleLinkedList.addToHead(9);
        doubleLinkedList.addToHead(7);
        doubleLinkedList.addToHead(66);
        doubleLinkedList.addToHead(25);
        doubleLinkedList.addToHead(55);
        doubleLinkedList.addToHead(56);
        doubleLinkedList.addToHead(15);
        doubleLinkedList.addToHead(59);
        doubleLinkedList.addToHead(525);
        doubleLinkedList.addToPosition(999, 4);
        doubleLinkedList.display();
        doubleLinkedList.removeAtPosition(4);
                doubleLinkedList.display();

    }
}
