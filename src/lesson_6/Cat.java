package lesson_6;

public class Cat {
    // field - поле класса
    private String name;
    private int age;
    private String breed;
    private String color;

    // constructor - конструктор


    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String breed, String color) {
        this.breed = breed;
        this.color = color;
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
}
