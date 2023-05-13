/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banksystem;

/**
 *
 * @author Youssef & Moody
 */
public class customer extends human {
     String SSN;
     String Address;
     bankaccount account;
    
    public customer(String Name, int Age, char Gender, String SSN, String Address, bankaccount account) {
        super(Name, Age, Gender);
        this.SSN = SSN;
        this.Address = Address;
        this.account = account;
    }
    
    public bankaccount getAccount() {
        return account;
    }
} 

