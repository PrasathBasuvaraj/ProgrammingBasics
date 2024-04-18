package LOKESH;

public class Entries {
    int age;

    int roll;

    String name;

    public Entries(String name, int roll, int age) {
        this.name = "lokesh";
        this.age = age;
        this.roll = roll;
    }

    public Entries(String name) {
        this.name = name;
        this.age = 22;
        this.roll = 3;
    }

    public String info() {
        return String.format("user %s of age %s is rolled at %s", name, age, roll);
    }
}
