/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankaccount;

/**
 *
 * @author Youssef & Moody
 */
public class BankAccount {
    private double balance;
    private String username;
    private String bankname;
    private static String country = "Egypt";
    private static int numOfUsers;
    private static int numOfCalls;

    public BankAccount() {
        balance = 0;
        username = "";
        bankname = "";
        numOfUsers++;
        System.out.println("A new bank account has been created.");
    }

    public BankAccount(double initialBalance, String username, String bankname) {
        balance = initialBalance;
        this.username = username;
        this.bankname = bankname;
        numOfUsers++;
        System.out.println("A new bank account has been created.");
    }

    public void deposit(double amount) {
        balance += amount;
        numOfCalls++;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            numOfCalls++;
        } else {
            System.out.println("Error: Insufficient balance.");
        }
    }

    public static int getNumOfUsers() {
        return numOfUsers;
    }

    public static int getNumOfCalls() {
        return numOfCalls;
    }

    public double getBalance() {
        return balance;
    }

    public String getUsername() {
        return username;
    }

    public String getBankname() {
        return bankname;
    }

    public static String getCountry() {
        return country;
    }


   public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount(1000, "John", "Bank of America");
        account2.deposit(500);
        account2.withdraw(200);
        System.out.println("Account balance: " + account2.getBalance());
        System.out.println("Number of users: " + BankAccount.getNumOfUsers());
        System.out.println("Number of calls: " + BankAccount.getNumOfCalls());
    }
    

}