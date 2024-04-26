/*2.17 (Arithmetic, Smallest and Largest) Write an application 
that inputs three integers from the user and displays the sum, average, 
product, smallest and largest of the numbers. */
import java.util.Scanner;

public class Ch2_ex217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: "); // prompting for first number
            int num1 = input.nextInt(); // storing first number

        System.out.print("Enter second number: "); // prompting for second number
        int num2 = input.nextInt(); // storing second number

        System.out.print("Enter third number: "); // prompting for third number
        int num3 = input.nextInt(); // storing third number

        System.out.printf("Sum: %d\n", num1 + num2 + num3); // printing the sum
        System.out.printf("Average: %d\n", num1 + num2 + num3 / 3); // printing the average
        System.out.printf("Product: %d\n", num1 * num2 * num3); // printing the product

        // finding the largest and smallest number
        int largest = num1;
         if (num2 > largest) {
             largest = num2;
         }
         if (num3 > largest) {
             largest = num3;
         }

        System.out.println("Largest number: " + largest); // printing largest number

        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        System.out.println("Smallest number: " + smallest); // printing smallest number

        input.close(); // closing the input
    }
}