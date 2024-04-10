public class Player {
    int age;

    int ranking;

    String name;


    public Player(String name, int age, int ranking) {
        this.name = name;
        this.age = age;
        this.ranking = ranking;
    }

    public Player(String name) {
        this.name = name;
        this.age = 20;
        this.ranking = 999;
    }


    public Player() {
        this.name = "Unknown";
        this.age = 0;
        this.ranking = 9999;
    }

    public String info() {
        return String.format("Player %s of age %s is ranked at %s", name, age, ranking);
    }
}
