package karthi;

public class StringContainsOnlyDigits {
    public static void main(String[] args) {
        String str = "12345";
        boolean onlyDigits = checkOnlyDigits(str);
        if (onlyDigits) {
            System.out.println("The string contains only digits");
        } else {
            System.out.println("The string does not contain only digits");
        }
    }

    public static boolean checkOnlyDigits(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
