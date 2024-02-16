package homework4;

/*
Task 5. ● Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 */
public class DriverProgram {
    public static void main(String[] args) {
        Plate plate = new Plate(50); // Initializing the plate with 50 units of food
        Cat[] cats = new Cat[3];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(); // Initializing cats
        }

        // Cats eat from the plate
        for (Cat cat : cats) {
            cat.eat(plate, 20); // Assuming each cat eats 20 units of food
        }

        // Display information about the satiety of cats
        for (int i = 0; i < cats.length; i++) {
            System.out.println("Cat " + (i + 1) + " satiety: " + cats[i].isSatiety());
        }

        Payment payment = new Payment();

        payment.addPurchase("Item 1", 10.5);
        payment.addPurchase("Item 2", 20.75);

        System.out.println("Total amount: $" + payment.getTotalAmount());

        Park park = new Park();

        // Adding attractions to the park
        Park.Attraction attraction1 = park.new Attraction("Ferris Wheel", "10:00 - 20:00", 15.99);
        Park.Attraction attraction2 = park.new Attraction("Roller Coaster", "11:00 - 21:00", 25.99);
        Park.Attraction attraction3 = park.new Attraction("Carousel", "09:00 - 19:00", 10.99);

        // Displaying information about attractions
        System.out.println("Attractions in the park:");
        System.out.println("1. " + attraction1.getName() + " - Opening hours: " + attraction1.getOpeningHours() + ", Cost: $" + attraction1.getCost());
        System.out.println("2. " + attraction2.getName() + " - Opening hours: " + attraction2.getOpeningHours() + ", Cost: $" + attraction2.getCost());
        System.out.println("3. " + attraction3.getName() + " - Opening hours: " + attraction3.getOpeningHours() + ", Cost: $" + attraction3.getCost());
    }

}
