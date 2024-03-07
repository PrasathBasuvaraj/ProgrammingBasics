public class Variables {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);


        int myNewNum;
        myNewNum = 15;
        System.out.println(myNewNum);

        myNewNum = 30;
        System.out.println(myNewNum);


        final int myFinalNum = 15;
//        myFinalNum = 20;  // will generate an error: cannot assign a value to a final variable


        String firstName = "John ";
        String lastName = "Doe ";
        int age = 54;
        String fullName = firstName + lastName + age;
        System.out.println(fullName);

//        int x = 5;
//        int y = 6;
//        System.out.println(x + y); // Print the value of x + y


        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        int minutesPerHour = 60;

//        int boolean = 56;

    }
}
