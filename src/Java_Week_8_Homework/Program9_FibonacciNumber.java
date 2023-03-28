package Java_Week_8_Homework;

/**
 * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */



public class Program9_FibonacciNumber {


    //calling the method in main method
    public static void main(String[] args) {
        fibonacciNumber();
    }
    public static void fibonacciNumber(){
        int n =10, a= 0,b=1;//change the value of n which represents the series
        System.out.println("Fibonacci  series  "   +    n    +    "Number");
        for(int i =1; i<=n; ++i){
            System.out.print(   a   +   "  ");
            int c = a + b;
            a=b;
            b=c;
        }
    }
}
