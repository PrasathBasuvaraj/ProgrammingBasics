package LOKESH;

public class DigitSum {
    public static void main(String[] args) {
        int number = 456;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        System.out.println(number+sum);
    }
}
