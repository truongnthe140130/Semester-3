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
public class LinkListStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList list = new MyList();
        Student st1 = new Student("HE140001", "Student 1");
        Student st2 = new Student("HE140002", "Student 2", 4.0);
        Student st3 = new Student("HE140003", "Student 3", 9.0);
        Student st4 = new Student("HE140004", "Student 4", 6.7);
        Student st5 = new Student("HE140005", "Student 5", 5.5);
        
        System.out.println("Add");
        list.addFirst(st1);
        list.addLast(st2);
        list.addLast(st3);
        list.display();
        System.out.println("Add index 2:");
        
        list.add(st4, 2);
        list.display();
        System.out.println("Add index 2:");
        
        list.add(st5, 2);
        list.display();
        System.out.println("Delete First");
        
        list.deleteFirst();
        list.display();
        System.out.println("Delete Last");
        
        list.deleteLast();
        list.display();
        System.out.println("delete index 2");
        
        list.delete(2);
        list.display();
        
    }
    
}
