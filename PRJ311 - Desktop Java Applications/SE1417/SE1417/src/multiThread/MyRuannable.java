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
public class MyRuannable implements Runnable{
    Display obj;

    public MyRuannable(Display obj) {
        this.obj = obj;
    }
    
    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("i="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
        }
     //   obj.disp1("runnable");
    }
    public static void main(String[] args) {
        MyRuannable t=new MyRuannable(new Display());
        //t.start();
        Thread t1=new Thread(t);
        t1.start();
    }
}
