package Java_Week_8_Homework;
/**
 * Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum
 * and maximum  number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;


public class Program2_MinAndMaxInputChallenge {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;
        int number;

        System.out.println("Enter any number  or enter -1 to break:");
        do {
            number = scan.nextInt();
            if (number == -1) {

            } else {
                if (number > largestNumber) {
                    largestNumber = number;
                } else {
                    if (number < smallestNumber) {
                        smallestNumber = number;
                    }
                }
            }
        }while(number != -1);
        System.out.println("The smallest number is :   " +  smallestNumber);
        System.out.println("The largest number is :    " + largestNumber);
        scan.close();
    }
}


