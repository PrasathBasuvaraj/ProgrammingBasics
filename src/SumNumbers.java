public class SumNumbers {
    public static void main(String[] args) {
        int total = 0;
        for (int counter = 1; counter<=100; counter++) {
            total += counter;
        }
        System.out.println("Sum =>" + total);
    }
}
