

public class Employee 
{
    // Encapsulation 
    
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor used to initialize Employee Details
    
    public Employee(int id, String name, String department, double salary) 
    {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


    // Getter Methods

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDepartment()
    {
        return department;
    }

    public double getSalary()
    {
        return salary;
    }
    

    
    // Setter Methods

    public void setId(int id)
    {
        this.id = id; 
    }
    public void setName(String name)
    {
        this.name = name; 
    }
    public void setDepartment(String department) 
    {
        this.department = department; 
    } 
    public void setSalary(double salary)
    { 
        this.salary = salary; 
    } 
    
    
    public double calculateAnnualSalary()
    {
        return salary * 12;
    }
    public double calculateAnnualSalary(double bonus)
    {
        return ((salary * 12) + bonus); 
    }
    public void displayDetails()
    {
        System.out.println("Employee ID: " + id); 
        System.out.println("Name: " + name); 
        System.out.println("Department: " + department); 
        System.out.println("Salary: " + salary); 
   }

   // Method Overriding - toString()
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Department: ").append(department).append("\n");
        sb.append("Salary: ").append(salary);
        return sb.toString();
    }
}
