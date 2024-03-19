package LOKESH;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 4, 5};
        int[] myArray1 = new int[]{6, 7, 8, 9, 10};
        int a1 = myArray.length;
        int a2 = myArray1.length;
        int a3 = a1 + a2;
        int[] resultArray = new int[a3];

        for (int i = 0; i < a1; i++) {
            resultArray[i] = myArray[i];
        }

        // Copy elements from myArray1 to resultArray
        for (int i = 0; i < a2; i++) {
            resultArray[a1 + i] = myArray1[i];
        }

        // Print the merged array
        System.out.println(Arrays.toString(resultArray));
    }
}
