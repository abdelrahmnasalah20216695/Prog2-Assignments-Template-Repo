/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;


public class bankaccount {
       private double balance;
    
    public double getBalance() {
        return balance + (balance * 0.1);
    }
    
    public void setBalance(double balance) {
        if (balance >= 0 && balance <= 1000000) {
            this.balance += balance;
        }
    }
    
    public void setBalance(double balance, double Tax) {
        this.balance += balance - (balance * (Tax / 100));
    }
}

