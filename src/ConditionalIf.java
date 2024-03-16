public class ConditionalIf {
    public static void main(String[] args) {
        int age = 12;
        if (age > 20 && age < 35) {
            System.out.println("User is ready for marriage");
        } else if(age == 35){
            System.out.println("User has passed marriage age");
        } else {
            System.out.println("User is not ready for marriage");
        }
    }
}
