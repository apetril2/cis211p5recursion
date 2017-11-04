import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by apetril2 on 10/14/2017.
 */
public class ComputePalindrome {


    public static void main(String[] args) throws IOException {

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

        long startTime;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("p5outPal.txt"));

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

        bufferedWriter.close();
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
}
