package homework2;

public class RotateArray {
    // Task 10*** Rotate given array by n places to the left if n is negative, else
    // rotate to the right
    public static void rotateArrayNPlaces(int[] arr, int n) {
        // Perform n % size shifts (even if n is negative)
        n %= arr.length;

        if (n < 0) {
            rotateToTheLeft(arr, -n);
        } else if (n > 0) {
            rotateToTheRight(arr, n);
        }
    }

    // Rotates Array to the left by n places (n is positive)
    private static void rotateToTheRight(int[] arr, int n) {
        while (n != 0) {
            int lastElement = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = lastElement;

            n--;
        }
    }


    // Rotates Array to the left by n places (n is positive)
    public static void rotateToTheLeft(int[] arr, int n) {
        while (n != 0) {
            int firstElement = arr[0];

            for (int i = 1; i < arr.length; i++) {
                arr[i - 1] = arr[i];
            }

            arr[arr.length - 1] = firstElement;

            n--;
        }
    }
}
