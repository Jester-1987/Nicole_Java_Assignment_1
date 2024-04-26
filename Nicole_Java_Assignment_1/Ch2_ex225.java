/* 2.25 (Odd or Even) Write an application that reads an integer and determines 
and prints whether it’s odd or even. 
[Hint: Use the remainder operator. An even number is a multiple of 2. 
Any multiple of 2 leaves a remainder of 0 when divided by 2.] */

import java.util.Scanner; // once again, thinking I'm going to need user input

public class Ch2_ex225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: "); // getting user input
        int num = input.nextInt(); // storing user input
        
        // determining even number    
        int even = num;
        if (num %2 == 0) {
            System.out.println(even + " is an even number.");
        }
        
        // determining odd number
        int odd = num;
        if(num %2 != 0) {
            System.out.println(odd + " is an odd number.");
        }
        input.close();
    }
}