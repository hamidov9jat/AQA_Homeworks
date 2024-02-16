package homework4;

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog() {
        super(500, 10);
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}
