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
public class CustomerAccount {

    String accountType;
    double balance;

    public CustomerAccount() {
    }

    public CustomerAccount(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}