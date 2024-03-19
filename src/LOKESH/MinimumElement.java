package LOKESH;

public class MinimumElement {
    public static void main(String[] args) {
        int[] numbers = new int[]{100, 99, 5673, 7654};
        int i;
        int min = numbers[0];
        for (i = 0; i < numbers.length; i++)
            if (numbers[i] < min)
                min = numbers[i];
        System.out.println(min);
    }
}
