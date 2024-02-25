/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue;

/**
 *
 * @author Cifer
 */
public class QueueImpl {
    Node front, rear;
    
    public QueueImpl() {
        this.front = null;
        this.rear = null;
    }
    
    public void enqueue(int data) {
        Node temp = new Node(data);
        
        if (this.rear == null) {
            this.front = temp;
            this.rear = temp;
            return;
        }
        
        this.rear.next = temp;
        this.rear = temp;
    }
    
    public void dequeue() {
        if (this.front == null) {
            return;
        }
        
        Node temp = this.front;
        this.front = this.front.next;
        
        if (this.front == null) {
            this.rear = null;
        }
    }
}
