import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by apetril2 on 10/14/2017.
 */
public class ComputeBinary {
    public static void main(String[] args) throws IOException {
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



        long startTime;
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("p5outBin.txt"));

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

        bufferedWriter.close();

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
