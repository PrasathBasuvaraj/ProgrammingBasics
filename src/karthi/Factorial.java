package karthi;

public class Factorial {
    public static void main(String[] args) {
        int karthi = 2;
        long factorial = 1;
        for (int i = 1; i <= karthi; i++) {
            factorial *= i;
        }
        System.out.println( factorial);
    }
}