package homework2;

public class DriverProgram {
    public static void main(String[] args) {

        // Testing method from task 2
        int x1 = 23, x2 = -7;
        System.out.println(TaskTwo.within10and20(x1, x2)); // true
        System.out.println(TaskTwo.within10and20(x1, x2-20)); //false

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


    }
}
