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
public class TransferManager implements Runnable {

    int transferCount = 0;
    CustomerAccount acc1;
    CustomerAccount acc2;

    public TransferManager(CustomerAccount acc1, CustomerAccount acc2) {
        this.acc1 = acc1;
        this.acc2 = acc2;
    }

    public int getTransferCount() {
        return transferCount;
    }

    @Override
    public void run() {
        while (true) {
            if (acc1.getBalance() == acc2.getBalance()) {
                break;
            }
            acc1.setBalance(acc1.getBalance() - 100);
            acc2.setBalance(acc2.getBalance() + 100);
            transferCount = transferCount + 1;
            System.out.println("Transfering 100.0 USD from account " + acc1.getAccountType() + " to account " + acc2.getAccountType());
        }
        System.out.println("Number of transfer instance: " + transferCount);

    }
}
