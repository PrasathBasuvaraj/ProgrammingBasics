package karthi;
public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int john = 10;
        int karthi = 20;
        int arun = 45;
        int largest = Math.max(john, Math.max(karthi, arun));
        System.out.println("Largest number: " + largest);
    }
}
