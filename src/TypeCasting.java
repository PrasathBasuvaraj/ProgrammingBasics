public class TypeCasting {

    public static void main(String[] args) {
        int myInt = 9;
        System.out.println(myInt);

        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myDouble);

        double myNewDouble = 9.78d;
        System.out.println(myNewDouble);   // Outputs 9.78

        int myNewInt = (int) myNewDouble; // Manual casting: double to int
        System.out.println(myNewInt);      // Outputs 9


    }
}
