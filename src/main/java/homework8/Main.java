package homework8;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;


/*
Task 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
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