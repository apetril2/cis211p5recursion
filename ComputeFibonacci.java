/**
 * Created by apetril2 on 10/14/2017.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ComputeFibonacci {
    public static void main(String args[]) throws IOException {

        int[] fibArray = new int[20];

        fibArray[0] = 1;
        fibArray[1] = 2;
        fibArray[2] = 3;
        fibArray[3] = 4;
        fibArray[4] = 5;
        fibArray[5] = 6;
        fibArray[6] = 7;
        fibArray[7] = 8;
        fibArray[8] = 9;
        fibArray[9] = 10;
        fibArray[10] = 11;
        fibArray[11] = 12;
        fibArray[12] = 13;
        fibArray[13] = 14;
        fibArray[14] = 15;
        fibArray[15] = 16;
        fibArray[16] = 17;
        fibArray[17] = 18;
        fibArray[18] = 19;
        fibArray[19] = 20;

        long startTime;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("p5outFib.txt"));

        for (int i = 0; i < fibArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Recursive: Fibonacci Value of " + fibArray[i] + " is " + fibonacci(fibArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }

        bufferedWriter.newLine();

        for (int i = 0; i < fibArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Iterative: Fibonacci Value of " + fibArray[i] + " is " + nFibonacci(fibArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }

        bufferedWriter.close();

    }

    public static long fibonacci(long n) {
        if (n == 0) // Base case
            return 0;
        else if (n == 1) // Base case
            return 1;
        else  // Reduction and recursive calls
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long nFibonacci(long n){
        if(n <= 1){
            return n;
        }
        int fib = 1;
        int fibPrev = 1;
        for(int i = 2; i < n; ++i){
            int temp = fib;
            fib += fibPrev;
            fibPrev = temp;
        }
        return fib;
    }
}

