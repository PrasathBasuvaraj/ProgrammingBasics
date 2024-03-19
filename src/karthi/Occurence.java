package karthi;

public class Occurence {
    public static void main(String[] args) {
        String john = "hello world";
        char ch = 'o';
        int count = 0;
        for (int i = 0; i < john.length(); i++) {
            if (john.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Occurrences of '" + ch + "' in the string: " + count);
    }
}
