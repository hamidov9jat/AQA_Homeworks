package homework2;

public class DriverProgram {
    public static void main(String[] args) {

        // Testing method from task 1
        int x1 = 23, x2 = -7;
        System.out.println(TaskOne.within10and20(x1, x2)); // true
        System.out.println(TaskOne.within10and20(x1, x2-20)); //false

        // Testing method from task 2
        TaskTwo.printIsPositiveOrNegative(x1); // positive
        TaskTwo.printIsPositiveOrNegative(x2); // negative
    }
}
