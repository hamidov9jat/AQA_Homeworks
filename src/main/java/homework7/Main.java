package homework7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
Структура csv файла:

Строка заголовок с набором столбцов

Набор строк с целочисленными значениями

* Разделитель между столбцами - символ точка с запятой (;)

Пример:

Value 1;Value 2;Value 3

100;200;123

300;400;500

Для хранения данных использовать класс вида:

public class AppData {

  private String[] header;

  private int[][] data;

 // ...

}

Если выполняется save(AppData data), то старые данные в файле полностью перезаписываются.
 */

public class Main {
    public static void main(String[] args) throws IOException {
        String[] header = {"Value 1", "Value 2", "Value 3"};
        int[][] data = {{100, 200, 123}, {300, 400, 500}};

        AppData appData = new AppData(header, data);

        // Save data to CSV file
        appData.saveToCsv("src/main/java/homework7/data.csv");

        // Load data from CSV file
        AppData loadedData = AppData.loadFromCsv("src/main/java/homework7/data.csv");

        System.out.println("Loaded data:");
        System.out.println(Arrays.toString(loadedData.getHeader()));
        System.out.println(displayData(loadedData.getData()));

    }

    public static String displayData(ArrayList<int[]> data) {
        return data.stream()
                .map(Arrays::toString)
                .collect(Collectors.joining("\n"));
    }

}
