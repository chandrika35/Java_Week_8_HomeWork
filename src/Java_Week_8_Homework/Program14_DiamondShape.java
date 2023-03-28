package Java_Week_8_Homework;
/**
 * 14. Write a program in Java to display the pattern like a diamond.   While loop
 *  *
 *  ***
 *  *****
 *  *******
 *  *********
 * ***********
 * *************
 * ***********
 *  *********
 *  *******
 *  *****
 *  ***
 *  *
 */

public class Program14_DiamondShape {


    public static void main(String[] args) {
shape();

    }
    public static void shape(){
        int number = 7;//the middle row
        int m = 1;//the first row where shape starts
        int n;
        while (m <= number) {
            n = 1;

            while (n++ <= number - m) {

                System.out.print(" ");
            }
            n = 1;

            while (n++ <= m * 2 - 1) {

                System.out.print("*");
            }
            System.out.println();

            m++;
        }
        m = number - 1;


        while (m > 0) {
            n = 1;
            while (n++ <= number - m){
                System.out.print(" ");

            }
            n = 1;
            while (n++ <= m * 2 - 1) {

                System.out.print("*");
            }

            System.out.println();

            m--;
        }
    }
    }







