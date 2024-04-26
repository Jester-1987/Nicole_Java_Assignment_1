/* 2.16 (Comparing Integers) Write an application that asks the user to enter two integers, 
obtains them from the user and displays the larger number followed by the words "is larger". 
If the numbers are equal, print the message "These numbers are equal" */

import java.util.Scanner;

public class Ch2_ex216 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // looking for input from user
        
        System.out.print("Enter first number: "); // prompting user for first input
        int number1 = input.nextInt(); // storing first int

        System.out.print("Enter second number: "); // prompting user for second input
        int number2 = input.nextInt(); // storing second int

        if (number1 > number2) { // if the first number is larger than the second
        System.out.printf("%d is larger\n", number1); // print the first number
        }

        if (number1 < number2) { // if the second number is larger than the first
        System.out.printf("%d is larger\n", number2); // print the second number
        }
        
        if (number1 == number2) { // if the numbers are the same
        System.out.print("These numbers are equal\n"); // print the numbers are equal
        } 
    
    input.close(); // closing the input
    }
}