package Karthi;

public class FibonicciSeries {
    public static void myMethod(int N) {

        int number1 = 0,number2 = 1;
        for (int i = 0; i < N; i++) {
            System.out.println(number1);
            int number3 = number2 + number1;
            number1 = number2 ;
            number2 = number3;

        }
    }

    public static void main(String[] args) {
        int N = 10;
        myMethod(N);
    }
}
