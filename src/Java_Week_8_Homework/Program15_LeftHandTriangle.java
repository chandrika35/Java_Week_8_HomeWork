package Java_Week_8_Homework;

/**
 * 15. Display left angle triangle of * using nested for loops
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * *
 */


public class Program15_LeftHandTriangle {

    public static void main(String[] args) {
        leftHandTriangle();
    }
public static void leftHandTriangle(){
    int r, c, n = 5;
    for (r = 0; r < n; r++)
    //r = rows, c = columns, n = number of rows
    {
        for (c = 2*(n-r); c > 2; c--)
        {
            System.out.print(" ");
        }
        for (c = 0; c <= r; c++ )
        {
            System.out.print("* ");
        }

        System.out.println();
    }
}
    }












