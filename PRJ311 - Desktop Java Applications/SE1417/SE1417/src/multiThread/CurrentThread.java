/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;

/**
 *
 * @author HP
 */
public class CurrentThread {
    public static void main(String[] args) {
//         get current thread
        Thread curThread=Thread.currentThread();
        System.out.println("Name:"+curThread.getName());
        System.out.println("Prioriry:"+curThread.getPriority());
     }
}
