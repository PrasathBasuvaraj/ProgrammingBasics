public class HelloString {
    public static void main(String[] args) {
        String greeting = "Hello";

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("XY")); // Outputs 7

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String x = "10";
        int y = 20;
        String z = x + y;  // z will be 1020 (a String)
        System.out.println(z);

        String txt2 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt2);
    }
}
