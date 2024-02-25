/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue;

/**
 *
 * @author Cifer
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueImpl queue = new QueueImpl();
        queue.enqueue(02);
        queue.enqueue(40);
        queue.enqueue(01);
        queue.enqueue(05);
        queue.enqueue(02);
        queue.enqueue(60);
        queue.enqueue(50);
        queue.enqueue(01);
        queue.enqueue(06);
        queue.enqueue(20);
        queue.enqueue(5);
        System.out.println("Queue Front : " + ((queue.front != null) ? (queue.front).data : -1));
        System.out.println("Queue Rear : " + ((queue.rear != null) ? (queue.rear).data : -1));
    }

}
