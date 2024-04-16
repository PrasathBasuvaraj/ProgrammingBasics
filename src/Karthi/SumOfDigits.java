package Karthi;

public class SumOfDigits {
    public static int sum(int number) {
        if (number < 10){
            return number;
        }
        return number % 10 + sum(number / 10);
    }

    public static void main(String[] args) {
        int number = 72737475;
        int result = sum(number);
        System.out.println("Sum of digits " + number + " is " + result);
    }
}
