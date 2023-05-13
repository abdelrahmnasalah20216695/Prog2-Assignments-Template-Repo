/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banksystem;

/**
 *
 * @author Youssef & Moody
 */
public class Banksystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         bankaccount account = new bankaccount();
        account.setBalance(1000);
        account.setBalance(500, 5);
        
        employee emp = new employee("John", 30, 'M', 5000, "IT");
        emp.PrintData();
        System.out.println("Salary: " + emp.getSalary() + ", Department: " + emp.getDepartment());
        emp.Greet();
        
        customer cus = new customer("Alice", 25, 'F', "123-45-6789", "123 Main St", account);
        cus.PrintData();
        System.out.println("SSN: " + cus.SSN + ", Address: " + cus.Address);
        System.out.println("Account balance: " + cus.getAccount().getBalance());
        cus.Greet();
    }
    
}
