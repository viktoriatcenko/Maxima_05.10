package lesson_4;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String str = "Hello world!";

        String str1 = new String("Hello from new initialization");

        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();

        if (email.length() == 0) {
            System.out.println("Error. Length of email must not to be 0");
        }

        if (!email.toLowerCase().endsWith(".ru")) {
            System.out.println("Error. Email must to be ended on russian domen");
            return;
        }


        String[] split = email.split("@");

        if (split.length != 2) {
            System.out.println("Error. Email must contains only one char '@' ");
        }

        if (email.startsWith(".")) {
            System.out.println("Error. Email must not to be started on char '.'");
        }

        String finalEmail = email.toLowerCase();

        System.out.println("Your email is correct : " + finalEmail);







    }
}
