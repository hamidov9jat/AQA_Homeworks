package homework2;

public class DriverProgram {
    public static void main(String[] args) {

        // Testing method from task one
        int x1 = 23, x2 = -7;
        System.out.println(TaskOne.within10and20(x1, x2)); // true
        System.out.println(TaskOne.within10and20(x1, x2-20)); //false
    }
}
