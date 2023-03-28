package Java_Week_8_Homework;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */



public class Program12_PrimeNumber {


    public static void main(String[] args) {

        int num = 19;
        boolean result = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for Non-prime number
            if (num % i == 0) {
                result = true;
                break;
            }
        }
        if (!result)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
