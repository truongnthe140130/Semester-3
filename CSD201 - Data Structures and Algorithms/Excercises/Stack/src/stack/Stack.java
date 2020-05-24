/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author letha
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Write stack with put(), pop();
        //Ap dung stack de kiem tra 1 String toan hoc co hop le hay ko, chi ktra ( va )
        //( thi put vao, ) pop ra
        Stack stack = new Stack();
        MyStack stack1 = new MyStack();
        String str1 = "(a+b)+c";
        String str2 = "((a+b)+c)+d";
        String str3 = "(a+b))+c";
        String str4 = "((a+b+c";

        System.out.println("String 1: " + stack.checkMath(str1));
        System.out.println("String 2: " + stack.checkMath(str2));
        System.out.println("String 3: " + stack.checkMath(str3));
        System.out.println("String 4: " + stack.checkMath(str4));
    }

    public boolean checkMath(String str) {

        char[] arr = str.toCharArray();
        MyStack stack = new MyStack();

        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == '(') {
                stack.push(arr[i + 1]);
            } else if (arr[i] == ')') {
                if (stack.pop() == null) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) {
            return true;
        }
        
        return false;
    }

}

class MyStack {

    Node head;
    int size;

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return this.size;
    }

    public void push(Object content) {
        Node node = new Node(content);
        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object content = head.getContent();
        head = head.next;
        return content;
    }
}

class Node {

    Object content;
    Node next;

    public Node() {
        next = null;
    }

    public Node(Object content) {
        this.content = content;
        this.next = null;
    }

    public Node(Object content, Node next) {
        this.content = content;
        this.next = next;
    }

    public Object getContent() {
        return content;
    }

    public Node getNext() {
        return next;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
