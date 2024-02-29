package homework8;
import java.util.ArrayList;
import java.util.HashMap;

/*
Task 2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */
public class TelephoneDirectory {

    private final HashMap<String, ArrayList<String>> directory;

    public TelephoneDirectory() {
        this.directory = new HashMap<String, ArrayList<String>>();
    }

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phoneNumbers = directory.computeIfAbsent(lastName, key -> new ArrayList<String>());
        phoneNumbers.add(phoneNumber);
    }

    public ArrayList<String> get(String lastName) {
        return directory.getOrDefault(lastName, new ArrayList<String>());
    }

}