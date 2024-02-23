package homework6;

/*
Task 3. В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException и вывести результат расчета.
 */
public class Main {
    public static void main(String[] args) {
        // Example usage:
        String[][] validArray = {{"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}};

        String[][] invalidSizeArray = {{"1", "2"}, {"3", "4"}};
        String[][] invalidDataArray = {{"1", "2", "a", "4"},
                                        {"1", "3", "a", "4"},
                                        {"17", "7", "a", "4"},
                                        {"89", "2", "a"}};


        try {
            int result = ArrayProcessor.sumArray(validArray);
            System.out.println("Sum of valid array: " + result);

            // This will throw MyArraySizeException
            ArrayProcessor.sumArray(invalidSizeArray);
        } catch (MyArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Invalid data error: " + e.getMessage());
        }

        try {
            // This will throw MyArrayDataException
            ArrayProcessor.sumArray(invalidDataArray);
        } catch (MyArrayDataException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        }

    }
}