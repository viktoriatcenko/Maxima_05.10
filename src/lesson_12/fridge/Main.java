package lesson_12.fridge;

public class Main {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();

        fridge.addProducts("Milk", 1);
        fridge.addProducts("Milk", 2);
        fridge.addProducts("Apple", 3);
        fridge.addProducts("Potatoes", 5);
        fridge.addProducts("Juice", 1);
        fridge.addProducts("Onion", 1);
        fridge.addProducts("Carrot", 2);
        fridge.addProducts("Meat", 4);
        fridge.addProducts("Fish", 1);
        fridge.addProducts("Onion", 2);

        fridge.all();

        fridge.take("Meat", 10);

        fridge.all();
    }
}
