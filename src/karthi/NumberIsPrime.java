package karthi;

public class NumberIsPrime {
    public static void main(String[] args) {
        int john = 7;
        boolean isPrime = true;
        if (john <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(john); i++) {
                if (john % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(john + " is prime");
        } else {
            System.out.println(john + " is not prime");
        }
    }
}
