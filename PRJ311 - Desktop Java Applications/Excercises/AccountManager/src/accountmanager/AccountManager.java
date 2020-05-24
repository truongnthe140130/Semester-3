/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accountmanager;

/**
 *
 * @author letha
 */ 
public class AccountManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerAccount acc1 = new CustomerAccount("ACC101", 1500);
        CustomerAccount acc2 = new CustomerAccount("ACC103", 700);
        TransferManager trans = new TransferManager(acc1, acc2);
        PrintThread printThread = new PrintThread(acc1, acc2);

        try {
            Thread transfer = new Thread(trans);
            Thread before = new Thread(printThread);
            Thread after = new Thread(printThread);
            System.out.println("Account balance before transfer:");
            before.start();
            Thread.sleep(100);
            transfer.start();
            Thread.sleep(1);
            System.out.println("Account balance after transfer:");
            after.start();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}

class PrintThread implements Runnable {

    CustomerAccount acc1;
    CustomerAccount acc2;

    public PrintThread() {
    }

    public PrintThread(CustomerAccount acc1, CustomerAccount acc2) {
        this.acc1 = acc1;
        this.acc2 = acc2;
    }

    @Override
    public void run() {
        System.out.println(acc1.getAccountType() + ": " + acc1.getBalance());
        System.out.println(acc2.getAccountType() + ": " + acc2.getBalance());
    }

}
