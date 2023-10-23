package lesson_4;

public class MethodTest {


    public static void main(String[] args) {
        System.out.println("Сейчас я вызову метод printFrom1to5");
        printFrom1to5();
        System.out.println("Вызов метода printFrom1to5 окончен");
        writeHello();
        printName("Oleg");
//        print2ndNameAndLastname("Viktorovich", "Iatsenko");
        printParentsNames("Yurii", "Lyubov");
        printAge(17);
        printCity("Kazan");

        int dream = getMyFutureSalary();

        System.out.println("My dream is " + dream);

        int otvet = get7x7();

        System.out.println("Result of 7 * 7 = " + otvet);


        System.out.println("Result of 7 * 9 = " + get7x(9));

        System.out.println(getSumma(1234, 200));

        System.out.println(getUmn(23, 44));

        System.out.println("Result of kvadrat " + getKvadrat(5));

    }




    // void - пустой
    public static void printFrom1to5() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
    }







    public static void writeHello() {
        System.out.println("Hello");
    }

    public static void printName(String name) {
        System.out.println("My name is " + name);
    }

    public static void printAge(int age) {
        System.out.println("My age is : " + age);
    }

    public static void printCity(String city) {
        System.out.println("My city " + city);
    }

    public static void print2ndNameAndLastname(String secondName, String lastname) {
        System.out.println("My 2ndName is " + secondName + " and my lastname is " + lastname);
    }

    public static void printParentsNames(String fathersName,String mothersName) {
        System.out.println("My my father's name is " + fathersName + " and my mother's name " + mothersName);
    }










    public static int getMyFutureSalary() {
        System.out.println("Сейчас подумаю....");
        return 300000;
    }




    public static int get7x7() {
        return 7 * 7;
    }


    public static int get7x(int num) {
        return 7 * num;
    }

    public static int getSumma(int num1, int num2) {
        return num1 + num2;
    }

    public static int getUmn(int num1, int num2) {
        return num1 * num2;
    }


    public static int getKvadrat(int num1) {
        return num1 * num1;
    }

}
