package homework2;

import java.util.Arrays;

public class TaskFive {

    // Task 5 Method for inverting elements of the array from zeros to ones
    // and vice versa
    public static void invertArrayElements() {
        byte[] arr = {0, 1, 0, 1, 1, 1, 0, 0};
        System.out.println("Before inverting array: " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (byte) (arr[i] == 1 ? 0 : 1);

            // or Apply XOR operator with 1 to each element of the array
//            arr[i] ^= 1;
        }

        System.out.println("After inverting array: " + Arrays.toString(arr));

    }
}
