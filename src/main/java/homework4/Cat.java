package homework4;

/*
Task 4. * Добавить подсчет созданных котов, собак и животных.

Task 5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
● Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
● Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
● Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety = false;


    public Cat() {
        super(200, 0);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void eat(Plate plate, int amount) {
        if (plate.getFoodAmount() >= amount) {
            plate.decreaseFood(amount);
            satiety = true;
        }
    }

    public boolean isSatiety() {
        return satiety;
    }
}
