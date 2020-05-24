package linklist;

/**
 *
 * @author letha
 */
public class Linklist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList list = new MyList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.display();
        System.out.println();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.display();
        System.out.println();
        list.add(100, 2);
        list.display();
        System.out.println();
        list.deleteFirst();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
        list.add(100, 2);
        System.out.println();
        list.display();
    }

}

class MyList {

    Node head, tail;
    int size;

    public MyList() {
        head = tail = null;
        size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void addFirst(int value) {
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

    void add(int value, int index) {
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
                int count = 0;
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

    void addLast(int value) {
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
                int count = 0;
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
            System.out.println(current.value + "");
            current = current.next;
        }
    }
    
    void deleteValue(int value, boolean pos) {
        //pos = true - > delete first value
        //pos = false -> delete last value
        if (pos == true) {
            if (head.value == value) deleteFirst();
        } else {
            Node current = head;
            Node target = null;
            while (current.next != null && current != null) {
                if (current.value == value) {
                    target = current;
                }
                current = current.next;
            }
            
            while (current.next != null && current != null) {
                if (current == target) {
                    current.next = current.next.next;
                    break;
                }
                current = current.next;
            }
        }
    }
    
    void deleteAll(int value) {
        
    }
    
    void search(int value) {
        
    }
    
    void sort(int begin, int end, boolean direction) {
        //sort tu index begin to end
        //direction true -> sort increase
        //direction false -> sort decrease
    }
    
    int count() {
        //count and return how many prime number in list
        return 0;
    }
    
    void maxFreq() {
        //display the range number that has maximum freqency with step = 10;
        //get the value/10 to get the int
    }
    
    String findPopularName () {
        //search and return name that appear the most
        String a = "";
        return a;
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
        next = null;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

}
