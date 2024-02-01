package homework2;

import java.util.Arrays;

public class TaskNine {
    // Task 9*
    public static int[] initialValueArray(int len, int initialValue) {
        if (len < 0) {
            return null;
        }

        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);

        // or
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = initialValue;
//        }

        return arr;
    }
}
