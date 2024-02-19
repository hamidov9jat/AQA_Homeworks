package homework8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/*
Task 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.
 */
public class WordStats {
    private String[] words;

    public WordStats(String[] words) {
        this.words = words;
    }

    public List<String> getUniqueWords() {
        return new ArrayList<>(new HashSet<>(List.of(words)));
    }

    public Map<String, Integer> getWordCounts() {
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }
        return counts;
    }
}