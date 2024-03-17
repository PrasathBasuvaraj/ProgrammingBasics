package LOKESH;

import java.util.Arrays;

public class SumElementsInArray {
    public static void main(String[] args) {
        int[] elements = new int[]{25, 45, 65};
        int sum = 0;
        for (int i = 0; i < elements.length; i++) {
            sum += elements[i];
        }
        System.out.println("Sum of elements in the array: " + sum);
        System.out.println(Arrays.toString(elements));
    }
}
