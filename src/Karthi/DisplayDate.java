package Karthi;

public class DisplayDate {
    public static void playerScore(String score) {
        System.out.println("Player score is ="+ score);
    }

    public static void playerScore(int score) {
        int x = 5 ;
        System.out.println("player score is ="+ score);
    }

    public static void main(String[] args) {
        playerScore("1");
        playerScore(5);
    }
}
