//driver Ch3_ex313.java

/* 3.13 (Employee Class) Create a class called Employee that includes three instance variables—a first name (type String), 
a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. 
Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value. 
Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. 
 */

public class Employee {
    // instance variables for firstName (String), lastName (String), monthlySalary (double)
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // constructor to initalize variables
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        // validating if monthly salary is greater than 0.0; if not keep it's inital value of 0.0
        if (monthlySalary >0.0) {
            this.monthlySalary = monthlySalary;
        }
    }

    // method that adds only a valid amount to the monthly salary
    public void monthlySalary(double monthlySalaryAmount) {
        if (monthlySalaryAmount > 0.0) { // if the amount is valid
            monthlySalary = monthlySalary + monthlySalaryAmount; // it's added to the monthly salary
        }
    } 

    // getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void SetLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}