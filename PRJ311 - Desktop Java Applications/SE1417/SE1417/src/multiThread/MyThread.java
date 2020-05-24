/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class MyThread extends Thread{
    Display obj;

    public MyThread() {
    }

    public MyThread(Display obj) {
        this.obj = obj;
    }
    public void run(){
        obj.disp1(this.getName());
    }
}
class MyThread1 extends Thread{
    Display obj;

    public MyThread1() {
    }

    public MyThread1(Display obj) {
        this.obj = obj;
    }
    public void run(){
        obj.disp2(this.getName());
    }
}


class Display{
    public void disp1(String name){
        for (int i = 0; i <=1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(name+" "+ i);
        }
    }
    public void disp2(String name){
        for (int i = 0; i <=1000; i++) {
            System.out.println(name+" "+ i);
        }
    }
}
class Test{
    public static void main(String[] args) {
        Display obj=new Display();
//        obj.disp1("ABC");
//        obj.disp2("XYZ");
        MyThread t1=new MyThread(obj);
        MyThread1 t2=new MyThread1(obj);
        //start() --> ready (queue) --> CPU (call run())
                
        t1.start(); // t1.run();
        t2.start(); //t2.run();
    }
}
