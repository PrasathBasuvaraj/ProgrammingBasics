package karthi;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String karthi = "radar";
        boolean isPalindrome = true;
        for (int i = 0; i < karthi.length() / 2; i++) {
            if (karthi.charAt(i) != karthi.charAt(karthi.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(karthi + " is a palindrome");
        } else {
            System.out.println(karthi + " is not a palindrome");
        }
    }
}
