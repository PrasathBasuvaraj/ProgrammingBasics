package karthi;

public class LongestWordSentence {
    public static void main(String[] args) {
        String sentence = "This is a sentence with some words";
        String[] words = sentence.split("\\s+");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.println("Length of the longest word: " + maxLength);
    }
}
