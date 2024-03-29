package homework5;

/*
Задача:
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.
 */

import java.util.ArrayList;

class Box<T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float weight = 0.0F;

        if (this.fruits.isEmpty()) {
            return weight;
        }

        T fruit = this.fruits.getFirst();

        if (fruit instanceof Apple) {
            weight = this.fruits.size() * Apple.WEIGHT;
        } else if (fruit instanceof Orange) {
            weight = this.fruits.size() * Orange.WEIGHT;
        }

        return weight;
    }

    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }

    public void transferFruit(Box<T> anotherBox) {
        if (this.getClass().equals(anotherBox.getClass())) {
            anotherBox.fruits.addAll(this.fruits);
            this.fruits.clear();
        } else {
            System.out.println("Cannot transfer fruits to a box of different type.");
        }
    }
}