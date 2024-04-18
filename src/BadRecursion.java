public class BadRecursion {
    public static void main(String[] args) {
        badMethod();
    }

    static void badMethod() {
        badMethod();
        System.out.println("Caught you dead !!!!!!!!!!!!!!!!");
        badMethod();
    }
}
