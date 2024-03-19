package karthi;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        int karthi = 18;
        int lokesh = 44;
        int gcd = findGCD(karthi, lokesh);
        System.out.println("GCD of " + karthi + " and " + lokesh + " is: " + gcd);
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
