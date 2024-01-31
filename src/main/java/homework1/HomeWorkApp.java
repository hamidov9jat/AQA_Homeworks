package homework1;

public class HomeWorkApp {
    public static void main(String[] args) {
        // Task 6 Testing methods from tasks 2-5
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }


    // Task 2 Метод печатает 3 слова в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    // Task 3 Метод на проверку знака суммы
    public static void checkSumSign() {
        int a = 23, b = 54;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Task 4 Метод выводит на экран цвета сфетофора
    // в зависимости от значения переменной value
    public static void printColor() {
        int value = 37;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Task 5 Метод для сравнения двух локальныйх переменных
    public static void compareNumbers() {
        int a = 23, b = 89;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
