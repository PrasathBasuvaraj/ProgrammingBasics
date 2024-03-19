package karthi;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        int karthi = 6;
        int lokesh = 42;
        int lcm = findlcm(karthi, lokesh);
        System.out.println("LCM of " + karthi + " and " + lokesh + " is: " + lcm);
    }

    public static int findlcm(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
