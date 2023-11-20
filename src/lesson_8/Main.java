package lesson_8;

import lesson_6.animals.Animal;
import lesson_8.singleton.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat = Cat.getCat();

        System.out.println(cat);

        Animal animal = new Animal();
        animal.printCatName();
    }
}
