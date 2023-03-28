package Java_Week_8_Homework;

/**
 *  Display right angle triangle of @ using nested for loops
 *  @
 *  @@
 *  @@@
 *  @@@@
 *  @@@@@
 */

import java.util.Scanner;

public class Program8_PatternTriangle {


    public static void main(String[] args) {


        Scanner scan  = new Scanner(System.in);

            System.out.print("Enter Right Angled Triangle Pattern Rows =  ");
            int rows = scan.nextInt();

            System.out.println("Printing Right Angled Triangle @ Pattern ");

            for (int i = 1 ; i <= rows; i++ )
            {
                for (int j = 1 ; j <= i; j++ )
                {
                    System.out.print("@");
                }
                System.out.println();
            }
        }
    }


