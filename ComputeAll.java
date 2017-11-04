import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by apetril2 on 11/4/2017.
 */
public class ComputeAll {

    public static void main(String[] args) throws IOException {

        long startTime;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("p5OutAndrewPetrillo.txt"));

        //===========================
        //begin FACTORIAL section
        //===========================
        bufferedWriter.write("FACTORIAL\n");
        bufferedWriter.write("==============================\n");

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
        //===========================
        //end FACTORIAL section
        //===========================
        bufferedWriter.write("\n\n");
        //===========================
        //begin FIBONACCI section
        //===========================
        bufferedWriter.write("FIBONACCI\n");
        bufferedWriter.write("==============================\n");

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
        //===========================
        //end FIBONACCI section
        //===========================
        bufferedWriter.write("\n\n");
        //===========================
        //begin PALINDROME section
        //===========================
        bufferedWriter.write("PALINDROME\n");
        bufferedWriter.write("==============================\n");

        String[] palindromeArray = new String[20];

        palindromeArray[0] = "anna";
        palindromeArray[1] = "civic";
        palindromeArray[2] = "kayak";
        palindromeArray[3] = "level";
        palindromeArray[4] = "madam";
        palindromeArray[5] = "mom";
        palindromeArray[6] = "noon";
        palindromeArray[7] = "racecar";
        palindromeArray[8] = "radar";
        palindromeArray[9] = "redder";
        palindromeArray[10] = "refer";
        palindromeArray[11] = "repaper";
        palindromeArray[12] = "eye";
        palindromeArray[13] = "rotator";
        palindromeArray[14] = "sagas";
        palindromeArray[15] = "solos";
        palindromeArray[16] = "stats";
        palindromeArray[17] = "tenet";
        palindromeArray[18] = "wow";
        palindromeArray[19] = "This is not a palindrome";


        for (int i = 0; i < palindromeArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Recursive: Is \"" + palindromeArray[i] + "\" a palindrome?: " + isPalindrome(palindromeArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }

        bufferedWriter.newLine();

        for (int i = 0; i < palindromeArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Iterative: Is \"" + palindromeArray[i] + "\" a palindrome?: " + nIsPalindrome(palindromeArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }
        //===========================
        //end PALINDROME section
        //===========================
        bufferedWriter.write("\n\n");
        //===========================
        //begin BINARY section
        //===========================
        bufferedWriter.write("BINARY\n");
        bufferedWriter.write("==============================\n");

        int[] binaryArray = new int[10];

        binaryArray[0] = 3;
        binaryArray[1] = 9;
        binaryArray[2] = 30;
        binaryArray[3] = 600;
        binaryArray[4] = 700;
        binaryArray[5] = 903;
        binaryArray[6] = 1200;
        binaryArray[7] = 1500;
        binaryArray[8] = 1602;
        binaryArray[9] = 2997;


        for (int i = 0; i < binaryArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Recursive: Index of " + binaryArray[i] + " in the list is " + binarySearch(binaryArray, binaryArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }

        bufferedWriter.newLine();

        for (int i = 0; i < binaryArray.length; i++)
        {
            startTime = System.nanoTime();
            bufferedWriter.write("Iterative: Index of " + binaryArray[i] + " in the list is " + nBinarySearch(binaryArray, binaryArray[i]));
            bufferedWriter.write(". It took " + (System.nanoTime() - startTime) + " nanoseconds to calculate\n");
        }
        //===========================
        //end BINARY section
        //===========================

        bufferedWriter.close();

    }//end main

    //other functions
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

    public static boolean isPalindrome(String word) {
        return isPalindrome(word, 0, word.length() - 1);
    }

    public static boolean isPalindrome(String word, int low, int high) {
        if (high <= low) // Base case
            return true;
        else if (word.charAt(low) != word.charAt(high)) // Base case
            return false;
        else
            return isPalindrome(word, low + 1, high - 1);
    }

    public static boolean nIsPalindrome(String word){
        char[] ch = word.toCharArray();
        int i1 = 0;
        int i2 = ch.length - 1;
        while (i2 > i1) {
            if (ch[i1] != ch[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        return binarySearch(list, key, low, high);
    }

    public static int binarySearch(int[] list, int key, int low, int high) {
        if (low > high)  // The list has been exhausted without a match
            return -low - 1;

        int mid = (low + high) / 2;
        if (key < list[mid])
            return binarySearch(list, key, low, mid - 1);
        else if (key == list[mid])
            return mid;
        else
            return binarySearch(list, key, mid + 1, high);
    }

    public static int nBinarySearch(int[] list, int key)
    {
        int l = 0, r = list.length - 1;
        while (l <= r)
        {
            int m = l + (r-l)/2;

            // Check if key is present at mid
            if (list[m] == key)
                return m;

            // If key greater, ignore left half
            if (list[m] < key)
                l = m + 1;

                // If key is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was not present
        return -1;
    }

}
