package homework2;

import java.util.Arrays;

public class TaskSix {
    // Task 6 Method for filling array of length 100
    public static void fillArray() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

//        System.out.println(Arrays.toString(arr));
    }
}
