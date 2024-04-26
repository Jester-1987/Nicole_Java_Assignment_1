/* Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again. */ 
// display yearly salary (monthlySalary * 12)

public class Ch3_ex313 {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("John", "Smith", -100.10); // bad employee, stole from company
        Employee employee2 = new Employee("Jane", "Doe", 3000.10); // honest employee
                
        //print results for employees muliplying monthly salary by 12 to get yearly salary
        System.out.printf("%s %s yearly balance: $%.2f\n",
        employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12);

        System.out.printf("%s %s yearly balance: $%.2f\n",
        employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12);

        // print results with 10% raises! Poor John... 
        System.out.printf("BONUS TIME! %s %s gets a 10%% raise! Their new yearly salary is: $%.2f\n", // double %% in order to display 10% properly or else java gives an error
        employee1.getFirstName(), employee1.getLastName(), employee1.getMonthlySalary() * 12 * 1.10);

        System.out.printf("BONUS TIME! %s %s gets a 10%% raise! Their new yearly salary is: $%.2f\n",        
        employee2.getFirstName(), employee2.getLastName(), employee2.getMonthlySalary() * 12 * 1.10);    
    }
}