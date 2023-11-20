package lesson_6.animals;

import lesson_8.singleton.Cat;

public class Animal {
    // fields
    private String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("My name is " + this.name);
    }

    public void eat() {
        System.out.println("I'm eating...");
    }

    public void makeNoise() {
        System.out.println("The animal is making some noise...");
    }

    public void print() {
        System.out.println("Hello world!");
    }

    public void printCatName() {
        Cat cat = Cat.getCat();
        System.out.println("Имя кота из класса Animal - " + cat.getName());
    }
}
