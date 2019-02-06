//Name: Naazdeep Kaur
//Student number: 0646902
//Program Discription: Implement an iterative function called fiboSeriesIte and  recursive function called fiboSeriesRec that will produce the Fibonacci
//series of numbers output up to a predefined n and also use a timing library to calculate and display the Fibonacci series to
//the user define nth number

import java.util.Scanner;

public class RecursiveAndIteration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //nth element input by the user
        System.out.println("Enter the last element of Fibonacci sequence: ");
        int n = sc.nextInt();

        //Print out iteration method
        System.out.println("Fibonacci iteration:");
        long start = System.currentTimeMillis();//time starts here
        System.out.print("Fibonacci series using iteration method upto " + n + " is ");//to display fibonacci numbers
        for (int i=0;i<n;i++) {
            System.out.print(" " + fiboSeriesIte( i ));
        }
        System.out.println("   ");
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fiboSeriesIte(n));
        long end = System.currentTimeMillis();//time ends here
        long timeElapsed= end-start;
        System.out.printf("Time: %d ms\n", timeElapsed );

        //Print out recursive method
        System.out.println("Fibonacci recursion:");
        long startTime = System.currentTimeMillis();
        System.out.print("Fibonacci series using recursive method upto " + n + " is ");
        for (int i=0;i<n;i++) {
            System.out.print(" " + fiboSeriesRec( i ));
        }
        System.out.println("   ");
        System.out.printf("Fibonacci sequence(element at index %d) = %d \n", n, fiboSeriesRec (n));
        long endTime = System.currentTimeMillis();
        long timeElapsed2= endTime-startTime;
        System.out.printf("Time: %d ms\n", timeElapsed2);
    }

    //Iteration method
    public static long fiboSeriesIte(int n) {
        int x = 0, y = 1, z = 1;
        for (int i = 0; i < n; i++) { //when a loop repeatedly executes until a base condition is reached
            /* On each iteration, we are assigning second number
             * to the first number and assigning the sum of last two
             * numbers to the second number
             */
            x = y;
            y = z;
            z = x + y;
        }
        return x;
    }

    //Recursive method
    public static long fiboSeriesRec (int  n) {
        if ((n == 1) || (n == 0)) {
            return n;
        }
        return fiboSeriesRec (n - 1) + fiboSeriesRec (n-2);
    }
}