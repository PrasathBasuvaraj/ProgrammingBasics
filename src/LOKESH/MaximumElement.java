package LOKESH;

import java.util.Arrays;

public class MaximumElement {
    public static void main(String[] args) {
        int[] numbers = new int[]{999, 876, 9289, 1234};
        int i;
        int max = numbers[0];
        for (i = 1; i < numbers.length; i++)
            if (numbers[i] > max)
                max = numbers[i];
        System.out.println(max);

    }
}
