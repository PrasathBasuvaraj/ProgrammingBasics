public class SumRecursion {

    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(9));
        System.out.println(sum(8));
        System.out.println(sum(5));
    }

    private static int sum(int startNumber) {
        if(startNumber > 0) {
            System.out.println("Number => " + startNumber);
            return startNumber + sum(startNumber-1);
        } else {
            return 0;
        }
    }
}
