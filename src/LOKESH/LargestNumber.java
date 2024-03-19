package LOKESH;

import java.util.Arrays;

public class LargestNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 7};
        int large = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > large) {
                large = numbers[i];
            }
        }
        System.out.println(large);
    }
}
