package Java_Week_8_Homework;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 * The method should return the sum of the even digits within the number.
 * If the number is negative, the method should return -1 to indicate an invalid value.
 * EXAMPLE INPUT/OUTPUT:
 * * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
 * * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
 * * getEvenDigitSum(-22); → should return -1 since the number is negative
 * NOTE: The method getEvenDigitSum should be defined as public static
 */

public class Program11_GetEvenDigitSum {

    public static void main(String[] args) {
        System.out.print(getEvenDigitSum(252));
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;  int total;
        if(number>0){
            while(number!=0){
                total=  number % 10;
                if(total % 2 == 0){
                    System.out.println(total+ " is a even digit");
                    sum= sum + total;
                }
                number = number/ 10;
            }
            return sum;
        }
        return -1;
    }

}

