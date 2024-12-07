package samplepackage;

class Employee {
    
    private int id;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(int id, String name, String department, double salary) {
        setId(id);
        this.name = name;
        this.department = department;
        setSalary(salary);
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Employee ID must be a positive integer.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        
            this.name = name;
        
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        
            this.department = department;
       
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            throw new IllegalArgumentException("Salary cannot be less than zero.");
        }
    }

   
    public double getBonus() {
        return salary * 0.1;
    }

  
    public void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}


public class EmployeeManagement {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee(1, "Alice Johnson", "Engineering", 5000);
        Employee emp2 = new Employee(2, "Bob Smith", "Marketing", 4500);

        // Display employee details-1
        System.out.println("Employee 1 Details:");
        emp1.displayEmployeeDetails();
        System.out.println("Bonus: $" + emp1.getBonus());

        System.out.println("\nEmployee 2 Details:");
        emp2.displayEmployeeDetails();
        System.out.println("Bonus: $" + emp2.getBonus());

        // Update employee details -2
      
        emp2.setDepartment("Sales");
        emp2.displayEmployeeDetails();

        // Test validations
        
            emp2.setSalary(-1000); // This will throw an error message
            emp2.setId(-5); // This will throw n error message
       
    }
}

