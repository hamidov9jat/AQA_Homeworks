package homework5;

public class DriverProgram {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox1.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        orangeBox.addFruit(new Orange());

        System.out.println("Apple Box 1 Weight: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 Weight: " + appleBox1.getWeight());
        System.out.println("Orange Box Weight: " + orangeBox.getWeight());

        System.out.println("Comparing Apple Box 1 with Orange Box: " + appleBox1.compare(orangeBox));

        appleBox1.transferFruit(appleBox2);


        System.out.println("Apple Box 1 Weight After Transfer: " + appleBox1.getWeight());
        System.out.println("Apple Box 2 Weight After Transfer: " + appleBox2.getWeight());
    }
}