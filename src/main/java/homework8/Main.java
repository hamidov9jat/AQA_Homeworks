package homework8;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


/*
Task 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

Task 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */

public class Main {
    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "programming", "hello", "java", "unique", "java",
                "python", "C++", "OOP", "python"};

        WordStats wordStats = new WordStats(words);

        List<String> uniqueWords = wordStats.getUniqueWords();
        printUniqueWords(uniqueWords);

        Map<String, Integer> wordCounts = wordStats.getWordCounts();
        printWordCounts(wordCounts);

        // Task 2
        TelephoneDirectory directory = new TelephoneDirectory();

        directory.add("Ivan", "123-456-7890");
        directory.add("Egor", "987-654-3210");
        directory.add("Jones", "555-555-5555");


        System.out.println("Mark's numbers:");
        for (String number : directory.get("Mark")) {
            System.out.println(number);
        }

        System.out.println("\nJones's number:");
        System.out.println(directory.get("Jones"));

    }

    public static void printWordCounts(Map<String, Integer> wordCounts) {
        System.out.println("\nWord Counts:");
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
    public static void printUniqueWords(List<String> uniqueWords) {
        System.out.println("Unique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

}