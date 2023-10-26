package lesson_6.polymorphism;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Cat();
        animal.eat();
    }
}
