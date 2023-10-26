package lesson_6.animals;

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
}
