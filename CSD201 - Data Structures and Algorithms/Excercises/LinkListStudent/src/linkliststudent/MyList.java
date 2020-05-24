/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkliststudent;

/**
 *
 * @author letha
 */
public class MyList {
    Node head, tail;
    int size;

    public MyList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(Student value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
            tail = node;
            size = 1;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }

    void add(Student value, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index!");
        } else {
            if (index == 0) {
                addFirst(value);
            } else if (index == size) {
                addLast(value);
            } else {
                Node node = new Node(value);
                Node current = head;
                int count = 1;
                while (count != index-1 && current != null) {
                    current = current.next;
                    count++;
                }
                node.next = current.next;
                current.next = node;
            }
            size++;
        }
    }

    void addLast(Student value) {
        Node node = new Node(value);
        if (size == 0) {
            head = node;
            tail = node;
            size = 1;

        } else {
            tail.next = node;
            tail = node;
            size++;
        }
    }
    
    void deleteFirst() {
        if (size == 0) {
            System.out.println("List is empty!");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }
    
    void delete(int index) {
        if (size == 0) {
            System.out.println("List is empty!");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            if (index == 0) {
                deleteFirst();
            } else if (index == size) {
                deleteLast();
            } else {
                //Homework
                //finish delete(int index);
                //Value = Student(String ten, String MSSV, double GPA);
                Node current = head;
                int count = 1;
                while (count != index-1 && current != null) {
                    current = current.next;
                    count++;
                }
                current.next = current.next.next;
            }
            size--;
        }
    }
    
    void deleteLast() {
        if (size == 0) {
            System.out.println("List is empty!");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
            size--;
        }
    }

    void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.value.getMssv() + " - " + current.value.getName() + " - " + current.value.getGpa());
            current = current.next;
        }
    }
}

class Node {
    Student value;
    Node next;

    public Node() {
        this.next = null;
    }

    public Node(Student value) {
        this.value = value;
        this.next = null;
    }

    
    
    public Node(Student value, Node next) {
        this.value = value;
        this.next = next;
    }
    
    
}
