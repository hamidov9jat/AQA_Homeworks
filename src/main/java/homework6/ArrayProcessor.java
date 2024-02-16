package homework6;

/*
Task 1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4. При подаче массива другого размера необходимо бросить исключение MyArraySizeException.

Task 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
 */

class ArrayProcessor {
    public static int sumArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        ArrayProcessor.checkArraySize(arr);
        int sum = 0, size=4;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }

        return sum;
    }

    public static void checkArraySize(String[][] arr) throws  MyArraySizeException {

        if (arr.length != 4) {
            throw new MyArraySizeException("Invalid array size. Expected 4x4");
        }

        ArrayProcessor.checkInnerSize(arr);

    }

    public static void checkInnerSize(String[][] arr) throws MyArraySizeException{
        for (String[] row : arr) {
            if (row.length != 4) {
                throw new MyArraySizeException("Invalid array size. Expected 4x4");
            }
        }
    }

}