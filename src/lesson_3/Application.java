package lesson_3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /**
         Операторы сравнения

         ==	Проверяет, равны или нет значения двух операндов, если да,
         то условие становится истинным	(A == B) – не верны

         !=	Проверяет, равны или нет значения двух операндов,
         если значения не равны, то условие становится истинным	(A != B) – значение истинна

         >	Проверяет, является ли значение левого операнда больше,
         чем значение правого операнда, если да, то условие становится истинным	(A > B) – не верны

         <	Проверяет, является ли значение левого операнда меньше,
         чем значение правого операнда, если да, то условие становится истинным	(A < B) – значение истинна

         >=	Проверяет, является ли значение левого операнда больше или равно значению правого операнда,
         если да, то условие становится истинным	(A >= B) – значение не верны

         <=	Проверяет, если значение левого операнда меньше или равно значению правого операнда,
         если да, то условие становится истинным	(A <= B) – значение истинна
         * */


        int a = 10;

        int b = 10;

        boolean c = a == b;

//        System.out.println(c);

        /**
         Логические операторы
         &&	Называется логический оператор «И». Если оба операнда являются не равны нулю, то условие становится истинным
         ||	Называется логический оператор «ИЛИ». Если любой из двух операндов не равен нулю, то условие становится истинным
         !	Называется логический оператор «НЕ». Использование меняет логическое состояние своего операнда.
         Если условие имеет значение true, то оператор логического «НЕ» будет делать false
         * */
        // 2 условия - если оба совпадают, тогда true, но если одно из них не совпадает, тогда false
        boolean bool1 = 10 > 5 && 15 < 10;

        // 2 условия - если хотя бы одно из них true, тогда true
        boolean bool2 = 100 > 50 || 50 > 100;

//        System.out.println(!bool2);


        /**
         if (условие) {
         //действие(-я), которые выполняются, если условие истинно;
         }
         else {
         //действие(-я), которые выполняются, если условие истинно;
         }
         * */

        int age = 11;

        if (age > 14) {
            System.out.println("Ок, проходите на фильм");
        } else {
            System.out.println("Нет, на фильм нельзя");
        }


        int height = 125;

        if (height > 125 && height < 220) {
            System.out.println("Да, можно на американские горки");
        } else {
            System.out.println("Нет, проход на аттракцион запрещен");
        }


//        int day = 5;

//        if (day == 1) {
//            System.out.println("Сегодня понедельник");
//        } else if (day == 2) {
//            System.out.println("Сегодня вторник");
//        } else if (day == 3) {
//            System.out.println("Сегодня ср");
//        } else if (day == 4) {
//            System.out.println("Сегодня чт");
//        } else if (day == 5) {
//            System.out.println("Сегодня пт");
//        } else if (day == 6) {
//            System.out.println("Сегодня сб");
//        } else if (day == 7) {
//            System.out.println("Сегодня вс");
//        } else {
//            System.out.println("Сегодня неизвестный день");
//        }

























        int rate = 7;

        if (rate == 5) {
            System.out.println("Отлично");
        } else if (rate == 4) {
            System.out.println("Хорошо");
        } else if (rate == 3) {
            System.out.println("Удо");
        } else if (rate == 2) {
            System.out.println("Плохо");
        } else if (rate == 1) {
            System.out.println("Отвратительно");
        } else {
            System.out.println("Оценка мне неизвестна");
        }







        int s = 35;

        // if (s > 50 && s < 100)
        if (s < 49 || s > 100) {
            System.out.println("Это число не попадает");
        } else {
            System.out.println("Это число попадает");
        }


        /**
         switch (ВыражениеДляВыбора) {
         case  (Значение1):
         Код1;
         break;
         case (Значение2):
         Код2;
         break;
         ...
         case (ЗначениеN):
         КодN;
         break;
         default:
         КодВыбораПоУмолчанию;
         break;
         }
         * */

        int number = 10;
        System.out.println();

//        Scanner scan = new Scanner(System.in);

//        int day = scan.nextInt();
//
//
//        switch (day) {
//            case (1) :
//                System.out.println("Сегодня понедельник");
//                break;
//            case (2) :
//                System.out.println("Сегодня вторник");
//                break;
//            case (3) :
//                System.out.println("Сегодня ср");
//                break;
//            case (4) :
//                System.out.println("Сегодня чт");
//                break;
//            case (5) :
//                System.out.println("Сегодня пт");
//                break;
//            case (6) :
//                System.out.println("Сегодня сб");
//                break;
//            case (7) :
//                System.out.println("Сегодня вс");
//                break;
//            default:
//                System.out.println("Сегодня неизвестный день");
//                break;
//        }



        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();

        switch (temp) {
            case (-15) :
                System.out.println("Сегодня холодно");
                break;
            case (0) :
                System.out.println("Сегодня нормально");
                break;
            case (15) :
                System.out.println("Сегодня тепло");
                break;
            default:
                System.out.println("Сегодня непонятная погода");
                break;
        }

    }
}
