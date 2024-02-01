package homework2;

import java.util.Arrays;

public class DriverProgram {
    public static void main(String[] args) {

        // Testing method from task 2
        int x1 = 23, x2 = -7;
        System.out.println(TaskTwo.within10and20(x1, x2)); // true
        System.out.println(TaskTwo.within10and20(x1, x2 - 20)); //false

        // Testing method from task 3
        TaskThree.printIsPositiveOrNegative(x1); // positive
        TaskThree.printIsPositiveOrNegative(x2); // negative

        // Testing method from task 4
        TaskFour.printStringNTimes("Hello Task 4", 3);

        // Testing task * method
        System.out.println(LeapYear.isLeapYear(2023)); // false
        System.out.println(LeapYear.isLeapYear(2024)); // true

        // Testing task 5 method
        TaskFive.invertArrayElements();

        // Testing task 6 method (prints 100 elements)
//        TaskSix.fillArray();

        // Testing task 7 method
//        TaskSeven.changeArray();

        // Testing task 8
        TaskEight.fillDiagonal();

        // Testing task 9
        assert TaskNine.initialValueArray(5, 78) != null;
        System.out.println(Arrays.toString(TaskNine.initialValueArray(5, 78)));
        assert TaskNine.initialValueArray(4, 34) != null;
        System.out.println(Arrays.toString(TaskNine.initialValueArray(4, 34)));
    }
}
