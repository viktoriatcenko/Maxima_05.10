package lesson_7;

import lesson_6.animals.Dog;

public class Initialization {
    public static void main(String[] args) {
        String italianDog = Dog.italianName;

        System.out.println(italianDog);

        double random = Algebra.randomDouble();

        System.out.println(random);




        int a = 0;

        Algebra algebra = new Algebra();

        System.out.println(algebra.getPi());

        String email;











        email = "test@mail.ru";

//        Util util = new Util();

        if (Util.check(email)) {
            System.out.println(email);
        } else {
            return;
        }


        String newHello = algebra.hello + " from class Initialization";


    }
}
