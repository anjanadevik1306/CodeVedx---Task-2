

public class Main 
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Alisha", "Support", 50000.00);
        e1.displayDetails(); 
        System.out.println("Annual Salary: " + e1.calculateAnnualSalary()); 
        System.out.println("Annual Salary with bonus: " + e1.calculateAnnualSalary(10000.00)); 
        System.out.println(e1); 
    }
}