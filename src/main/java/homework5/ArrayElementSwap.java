package homework5;

/*
Task 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
 */
public class ArrayElementSwap {
    public static <T> void swapElements(T[] array, int index1, int index2) {
        boolean isValidOperation =
                (array == null) || (index1 < 0) || (index2 < 0) || (index1 >= array.length) || (index2 >= array.length);

        if (isValidOperation) {
            throw new IllegalArgumentException("Oops! Looks like we're playing outside the array boundaries!");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}