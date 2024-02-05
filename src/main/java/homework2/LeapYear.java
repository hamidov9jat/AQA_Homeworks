package homework2;

public class LeapYear {
    // Task * Method checks whether the given year is leap or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
