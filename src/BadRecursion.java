public class BadRecursion {
    public static void main(String[] args) {
        badMethod();
    }

    private static void badMethod() {
        System.out.println("Caught you dead !!!!!!!!!!!!!!!!");
        badMethod();
    }
}
