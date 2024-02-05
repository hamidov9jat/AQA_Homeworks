package homework3;

/*
Task 4. Создать массив из 5 сотрудников.
Пример:
// Вначале объявляем массив объектов
Person[] persArray = new Person[5];

// потом для каждой ячейки массива задаем объект
persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
persArray[1] = new Person(...);
...
persArray[4] = new Person(...);

Task 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */

public class DriverProgram {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Andrei Polyakov",
                "Software Developer",
                "andreip@example.com", "234789345", 2500, 24);
        employees[1] = new Employee("Pavel Safonov",
                "Data Engineer",
                "da_igor@mailbox.com", "739098123", 5000, 42);
        employees[2] = new Employee("Roman Tihonov",
                "QA Tester",
                "roman_ti@example.com", "345728928", 3000, 32);
        employees[3] = new Employee("Ilya Volkov",
                "AI Specialist",
                "ai_volkovp@mailbox.com", "234687178", 4200, 28);
        employees[4] = new Employee("Valeriy Orlov",
                "Software Architect",
                "valeriy_volkov@example.com", "389649823", 6400, 45);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println("------");
                System.out.println(employee);
                System.out.println("------");
            }
        }


    }
}
