package lesson_6.animals;

public class Cat extends Animal {
    private String catName;

    public Cat(String name, String catName) {
//        super(name);
        this.catName = catName;
    }

    public Cat() {

    }

    public void sleep() {
        System.out.println("I'm sleeping 18 hours at day...");
    }

//    @Override
//    public void makeNoise() {
//        super.makeNoise();
//        System.out.println("Cat is saying meow...");
//    }


}
