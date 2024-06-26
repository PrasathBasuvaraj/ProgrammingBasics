package Karthi;

public class PowerFunction {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / (base * power(base, -exponent - 1));
        }
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponent = 3;
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
