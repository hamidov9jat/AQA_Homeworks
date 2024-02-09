package homework4;

/*
Task 1. Создать классы Собака и Кот с наследованием от класса Животное.

Task 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');

Task 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).

Task 4. * Добавить подсчет созданных котов, собак и животных.

 */

class Animal {
    protected int runLimit;
    protected int swimLimit;
    protected static int animalCount = 0;

    public Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }

    public void run(int length) {
        if (length <= runLimit) {
            System.out.println("The animal ran " + length + " m.");
        } else {
            System.out.println("The animal cannot run that far.");
        }
    }

    public void swim(int length) {
        if (length <= swimLimit) {
            System.out.println("The animal swam " + length + " m.");
        } else {
            System.out.println("The animal cannot swim that far.");
        }
    }
}

