package Karthi;

public class StringIsPalindrome {
    public static void main(String[] args) {
        String karthi = "radarr";
        System.out.println("length of"+karthi.length() );
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
