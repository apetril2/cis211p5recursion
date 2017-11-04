/**
 * Created by apetril2 on 10/14/2017.
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
public class ComputeFactorial {
    public static void main(String[] args) throws IOException {

        int[] factorialArray = new int[20];

        factorialArray[0] = 1;
        factorialArray[1] = 2;
        factorialArray[2] = 3;
        factorialArray[3] = 4;
        factorialArray[4] = 5;
        factorialArray[5] = 6;
        factorialArray[6] = 7;
        factorialArray[7] = 8;
        factorialArray[8] = 9;
        factorialArray[9] = 10;
        factorialArray[10] = 11;
        factorialArray[11] = 12;
        factorialArray[12] = 13;
        factorialArray[13] = 14;
        factorialArray[14] = 15;
        factorialArray[15] = 16;
        factorialArray[16] = 17;
        factorialArray[17] = 18;
        factorialArray[18] = 19;
        factorialArray[19] = 20;

        long startTime;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("p5outFac.txt"));

        for (int i = 0; i < factorialArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Recursive: Factorial of " + factorialArray[i] + " is " + factorial(factorialArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }

        bufferedWriter.newLine();

        for (int i = 0; i < factorialArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Iterative: Factorial of " + factorialArray[i] + " is " + nFactorial(factorialArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }

        bufferedWriter.close();

    }

    public static long factorial(int n) {
        long startTime = System.nanoTime();
        if (n == 0) // Base case
            return 1;
        else
            return n * factorial(n - 1); // Recursive call
    }

    public static long nFactorial(int n) {
        long result = 1;

        if (n == 0) // Base case
            return 1;
        else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            //return n * factorial(n - 1); // Recursive call
        }
        return result;
    }
}
