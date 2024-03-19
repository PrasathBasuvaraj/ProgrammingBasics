package karthi;

public class FactorialRecursion {
    public static void main(String[] args) {
        int karthi = 5;
        long factorial = findFactorial(karthi);
        System.out.println(karthi + factorial);
    }

    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}
