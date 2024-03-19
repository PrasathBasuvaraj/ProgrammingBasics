package karthi;

public class ReverseNumber {
    public static void main(String[] args) {
        int karti = 12345;
        int reversed = 0;
        while (karti != 0) {
            int digit = karti % 10;
            reversed = reversed * 10 + digit;
            karti /= 10;
        }
        System.out.println(reversed);

    }
}
