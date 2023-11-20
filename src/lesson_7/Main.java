package lesson_7;

import lesson_6.animals.Animal;
import lesson_6.animals.Cat;
import lesson_6.animals.Dog;

public class Main  {
    public static void main(String[] args) {
        // Восходящее преобразование
        // Upcasting
//        Animal animal = new Cat();


        Cat cat = new Cat();
        Dog dog = new Dog();

        doSomething(dog);
    }

    public static void doSomething(Object object) {
        // Нисходящее преобразование
        // Downcasting

        if (object instanceof Cat) {
            Cat cat = (Cat) object;
            cat.sleep();
        } else if (object instanceof Dog) {
            Dog dog = (Dog) object;
            dog.walk();
        }
    }
}
