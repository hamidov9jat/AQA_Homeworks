package homework4;

/*
Task 5. Расширить задачу про котов и тарелки с едой, выполнив следующие пункты:
● Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
● Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.
● Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 */
class Plate {
    private int foodAmount;

    public Plate(int foodAmount) {
        if (foodAmount >= 0) {
            this.foodAmount = foodAmount;
        } else {
            this.foodAmount = 0;
        }
    }

    public void decreaseFood(int amount) {
        if (amount <= foodAmount) {
            foodAmount -= amount;
        }
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
