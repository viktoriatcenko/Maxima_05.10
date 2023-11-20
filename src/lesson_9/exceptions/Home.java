package lesson_9.exceptions;

public class Home {
    public static void main(String[] args) {
        Dog dog = new Dog("Sharik");

        dog.putCollar();
        dog.putLeash();


        try {
            dog.walk();
        } catch (DogIsNotReadyException e) {
            e.printStackTrace();
            System.out.println("Проверяем что не так с псом: " +
                    "Ошенйик " + dog.isCollarPutOn() + " " +
                    "Поводок  " + dog.isLeashPutOn() + " " +
                    "Намордник " + dog.isMuzzlePutOn() + " "
            );

        }
    }
}
