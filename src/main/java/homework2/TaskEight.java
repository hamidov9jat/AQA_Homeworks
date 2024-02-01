package homework2;

import java.util.Arrays;

public class TaskEight {
    // Task 8 Method for making diagonal elements of 2D array equal to 1
    public static void fillDiagonal() {
        // Assume that all values except diagonal are garbage
        int[][] arr = new int[7][7];
        int last_index = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][last_index - i] = 1;
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
