/*2.26 (Multiples) Write an application that reads two integers, 
determines whether the first is a multiple of the second and prints the result. 
[Hint: Use the remainder operator.]*/

import java.util.Scanner; // getting user input

public class Ch2_ex226 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: "); // input for first number
        int num1 = input.nextInt();

        System.out.print("Enter second number: "); // input for second number
        int num2 = input.nextInt();

        // are the numbers multiples of each other?
        int multi = num1;
        if (num1 % num2 == 0) {
            System.out.println(multi + " is a multiple of " + num2);
        }

        // are the numbers not multiples of each other?
        int notMulti = num1;
        if (num1 % num2 != 0) {
            System.out.println(notMulti + " is not a multiple of " + num2);
        }
        input.close(); // closes the input
    }
}