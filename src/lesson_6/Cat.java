package lesson_6;

import lesson_6.animals.Animal;

public class Cat extends Animal {
    // field - поле класса
    String name;
    int age;
    private String breed;
    private String color;

    // constructor - конструктор

    public Cat(String name, String name1) {
        super(name);
        this.name = name1;
    }


    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }


    public Cat(int age) {
        this.age = age;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    // геттеры и сеттеры
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("My name is " + this.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
