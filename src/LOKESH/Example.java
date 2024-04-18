package LOKESH;

public class Example {

    public static void main(String[] args) {
        Modifiers modifier1 = new Modifiers(25);
        modifier1.age = 30;
        modifier1.name = "lokesh";
        modifier1.setSex("male");
        System.out.println("Age of modifier is" + modifier1.age + ": " + modifier1.getSex());
        System.out.println(modifier1.name);
    }
}
