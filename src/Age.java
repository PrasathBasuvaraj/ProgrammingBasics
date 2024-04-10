public class Age {
    public static void main(String[] args) {
        System.out.println(displayCategory(34));
        System.out.println(displayCategory(54));
    }

    public static String displayCategory(int personAge) {
        int ageLimit = 18;
        if(personAge > ageLimit) {
            boolean isAdult = true;
            return "Person is an adult";
        } else {
            boolean isNotAdult = true;
            return "Person is not an adult";
        }

    }
}
