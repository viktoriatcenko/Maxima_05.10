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
            System.out.println("��������� ��� �� ��� � ����: " +
                    "������� " + dog.isCollarPutOn() + " " +
                    "�������  " + dog.isLeashPutOn() + " " +
                    "��������� " + dog.isMuzzlePutOn() + " "
            );

        }
    }
}
