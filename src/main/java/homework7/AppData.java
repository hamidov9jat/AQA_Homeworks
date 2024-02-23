package homework7;

/*
Task 1. Реализовать сохранение данных в csv файл;

Task 2. Реализовать загрузку данных из csv файла. Файл читается целиком.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AppData {
    private String[] header;
    private ArrayList<int[]> data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = new ArrayList<>();
        for (int[] row : data) {
            this.data.add(row.clone()); // Copy array to avoid modifying original
        }
    }

    public AppData(String[] header, List<int[]> data) {
        this.header = header;
        this.data = new ArrayList<>(data);
    }

    public void saveToCsv(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Write header
            writer.write(String.join(";", header));
            writer.newLine();

            // Write data rows
            for (int[] row : data) {
                // Stream each element, convert to string, join with semicolon
                String rowString = IntStream.of(row)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(";"));
                writer.write(rowString);
                writer.newLine();
            }
        }
    }

    public static AppData loadFromCsv(String filename) throws IOException {
        String[] header;
        List<int[]> data;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            header = reader.readLine().split(";");

            data = reader.lines()
                    .skip(0)
                    .map(line -> line.split(";"))
                    .map(row -> Arrays.stream(row)
                            .mapToInt(Integer::parseInt)
                            .toArray())
                    .toList();

        }

        return new AppData(header, data);
    }
//        List<String[]> lines = new ArrayList<>();
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                lines.add(line.split(";"));
//            }
//        }
//
//        // Extract header and data
//        String[] header = lines.getFirst();
//        ArrayList<int[]> data = new ArrayList<>();
//        for (int i = 1; i < lines.size(); i++) {
//            int[] row = new int[lines.get(i).length];
//            for (int j = 0; j < row.length; j++) {
//                row[j] = Integer.parseInt(lines.get(i)[j]);
//            }
//            data.add(row);
//        }

//        return new AppData(header, data);
//    }

    public String[] getHeader() {
        return this.header;
    }

    public ArrayList<int[]> getData() {
        return this.data;
    }
}