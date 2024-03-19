package karthi;

public class ElementsInArray {
        public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            double average = findAverage(arr);
            System.out.println("Average of elements in the array: " + average);
        }

        public static double findAverage(int[] arr) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            return (double) sum / arr.length;
        }
    }
