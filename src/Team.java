public class Team {

    public static void main(String[] args) {
        Player player1 = new Player("Dhoni", 45, 2);
        Player player2 = new Player("Kholi");
        Player player3 = new Player();

        System.out.println("Player 1 info => " + player1.info());
        System.out.println("Player 2 info => " + player2.info());
        System.out.println("Player 3 info => " + player3.info());
    }
}
