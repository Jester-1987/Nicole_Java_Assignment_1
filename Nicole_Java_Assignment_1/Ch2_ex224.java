/* 2.24 (Largest and Smallest Integers) Write an application that 
reads five integers and determines and prints the largest and 
smallest integers in the group. Use only the programming techniques 
you learned in this chapter. */

import java.util.Scanner; // I'm assuming that I need to get input from the user

public class Ch2_ex224 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // looking for user input

        System.out.print("Enter first number: "); // first input
        int num1 = input.nextInt(); // storing first int. Repeat these two lines until 5 inputs.

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        System.out.print("Enter fourth number: ");
        int num4 = input.nextInt();

        System.out.print("Enter fifth number: ");
        int num5 = input.nextInt();

        // finding the largest number
        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }

        System.out.println("Largest number: " + largest); // printing largest number

        // finding the smallest number
        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        if (num4 < smallest) {
            smallest = num4;
        }
        if (num5 < smallest) {
            smallest = num5;
        }

        System.out.println("Smallest number: " + smallest); // printing smallest number  
        
        input.close(); // closing input
    }
}