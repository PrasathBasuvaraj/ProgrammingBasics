package karthi;

public class FibonacciSeries {
    public static void main(String[] args) {
        int karthi = 8;
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < karthi; i++) {
            System.out.print(first + " ");
            int sum = first + second;
            first = second;
            second = sum;
        }
    }
}
