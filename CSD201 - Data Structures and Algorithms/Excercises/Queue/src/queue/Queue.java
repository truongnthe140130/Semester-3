/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author letha
 */
public class Queue {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.display();
        
        System.out.println("");
        queue.dequeue();
        queue.display();
        
        
    }
    
}

class MyQueue {
    Node head, tail;
    
    public MyQueue() {
        head = tail = null;
    }
    
    boolean isEmpty() {
        return head == null;
    }
    
    public void setHead(Node head) {
        this.head = head;
    }
    
    public void setTail(Node tail) {
        this.tail = tail;
    }
    
    public Node getHead() {
        return this.head;
    }
    
    public Node getTail() {
        return this.tail;
    }
    
    public void enqueue(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = tail = node;
        } else {
            tail.setNext(node);
            tail = node;
        }
    }
    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        else {
            head = head.next;
        }
    }
    
    void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value + "");
            current = current.next;
        }
    }
}

class Node {
    int value;
    Node next;

    public Node() {
        next = null;
    }
    
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
