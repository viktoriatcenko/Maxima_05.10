package lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat snezhok = new Cat("Snezhok");
        Cat pushok = new Cat(5);
        Cat boris = new Cat(5, "Boris");
        System.out.println("My cat's name is " + boris.getName() + " and his age is " + boris.getAge());

        Cat persik = new Cat("Persik", 3, "Dvornyaga", "White");

        Cat cat = new Cat();

        snezhok.setAge(5);
        snezhok.setBreed("Siam cat");
        snezhok.setColor("Black");

        System.out.println("I have Cat. His name is " + snezhok.getName());
        System.out.println("His age is " + snezhok.getAge());
        System.out.println("His breed is " + snezhok.getBreed());
        System.out.println("He is " + snezhok.getColor());


        // get - получить ---- set - установить
        Dog dog = new Dog();
        dog.setHeight(30);

        Dog barsik = new Dog("Barsik", 120, 30);


        System.out.println("I have the dog. His name is " + barsik.getName() +
                ". He is very fast. His speed is " + barsik.getSpeed() +
                ". Bit he is dwarf. His weight is " + barsik.getHeight());

        barsik.setName("Barsik Velikiy");
        barsik.setSpeed(40);
        barsik.setHeight(40);
        barsik.setFriend(persik);


        System.out.println("I have the dog. His name is " + barsik.getName() +
                ". He is very fast. His speed is " + barsik.getSpeed() +
                ". Bit he is dwarf. His weight is " + barsik.getHeight() + "His friend is " + barsik.getFriend().getName());




        boris.printName();
    }
}
