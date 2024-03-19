package karthi;

import java.util.Arrays;
import java.util.Collections;

public class SortInDescendingOrder {
    public static void main(String[] args) {

        Integer[] arr = {5, 3, 9, 2, 7};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println( Arrays.toString(arr));
    }
}
