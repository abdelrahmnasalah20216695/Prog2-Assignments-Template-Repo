
package banksystem;


public class human {
     
    protected String Name;
    protected int Age;
    protected char Gender;
    
    public human(String Name, int Age, char Gender) {
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }
    
    protected void PrintData() {
        System.out.println("Name: " + Name + ", Age: " + Age + ", Gender: " + Gender);
    }
    
    final public void Greet() {
        System.out.println("Good Morning");
    }
}

