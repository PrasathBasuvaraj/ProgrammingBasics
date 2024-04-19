package abstraction;

public abstract class Game {

    public abstract void defineRules();

    public abstract void scoringStrategy();

    public void startGame() {
        System.out.println("Game started");
    }

    public void endGame() {
        System.out.println("Game started");
    }

}
