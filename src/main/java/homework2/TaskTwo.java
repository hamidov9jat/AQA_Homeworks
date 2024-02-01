package homework2;

public class TaskTwo {

    // Task 2 Method to check whether the sum of two integers is withing 10
    // and 20 (both ends included)
    public static boolean within10and20(int x1, int x2) {
        int sum = x1 + x2;
        return (10 <= sum) && (sum <= 20);
    }
}
