package lesson_9.exceptions;

import java.io.*;

public class Main {
    public static void main(String[] args) {
//        int counter = 10;
//
//        while (counter > 0) {
//            System.out.println(counter + "...");
//            Thread.sleep(1000);
//            counter--;
//        }
//    }


        System.out.println("1. Exception - how it works");
//        System.out.println(10 / 0);

//        ArithmeticException arithmeticException = new ArithmeticException();
//        arithmeticException.printStackTrace();
//        System.exit(0);
        System.out.println("2. Exception / null - how it works");
        String s = null;
//        System.out.println(s.length());
        System.out.println("3. Handling Exception  - how it works");
        if (s != null) {
            System.out.println(s.length());
        }
        System.out.println("4. Handling Exception by try/catch - how it works");

        File myFile = new File("fi.txt");

        String line = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(myFile));
            line = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = null;
        try {
             reader = new BufferedReader(new FileReader(myFile));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            System.out.println("ÏĞÎÈÇÎØËÀ ÎØÈÁÊÀ, ÎÒÏĞÀÂÜ ÑÌÑ Ñ ÎØÈÁÊÎÉ");
        }


        System.out.println("Îêîí÷àíèå ïğîãğàììû");
    }
}
