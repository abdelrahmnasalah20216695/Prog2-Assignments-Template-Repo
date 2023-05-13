
package banksystem;

public class employee extends human {
       private int salary;
    private String department;
    
    public employee(String Name, int Age, char Gender, int salary, String department) {
        super(Name, Age, Gender);
        this.salary = salary;
        this.department = department;
    }
    
    @Override
    protected void PrintData() {
        super.PrintData();
        System.out.println("Salary: " + salary + ", Department: " + department);
    }
    
    public int getSalary() {
        return salary;
    }
    
    public String getDepartment() {
        return department;
    }
}
