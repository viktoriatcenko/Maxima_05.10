package lesson_2;

public class Practice {
    public static void main(String[] args) {
        // Арифметические операторы

        /**
         Арифметические операторы
         +	Складывает значения по обе стороны от оператора
         -	Вычитает правый операнд из левого операнда
         *	Умножает значения по обе стороны от оператора
         /	Оператор деления делит левый операнд на правый операнд
         %	Делит левый операнд на правый операнд и возвращает остаток
         ++	Инкремент - увеличивает значение операнда на 1 х++ постфиксная, ++х префиксная
         --	Декремент - уменьшает значение операнда на 1	х-- постфиксная, --х префиксная
         * */

//        int a = 10; // 10 / 3 = 3
//
//        int b = 3;
//
//        int c = a % b;
//
//        int d = a % 2;
//
//        int e = 5;
//
//        e--; // e = e + 1;
//
//        System.out.println(e);

        // Задача 1. Дано: a = 60, b = 45, c = 17. Найти периметр треугольника

        int a = 60;

        int b = 45;

//        int c = 17;

//        int perimeterDamira = a + b + c;

//        System.out.println(perimeterDamira);

        int e = 50;

//        int f = 100;
//
//        int summa = e + f;
//
//        System.out.println(summa);

        // Задача 2. Дано: Голодный Вася съедает за 9 минут 3 банана, а сытый за 15 минут,
        //  насколько быстрее голодный Вася съедает один банан?

        byte hungryTime = 9;

        int fullTime = 15;

        int bananas = 3;

        int oneBananasInHungryTime = hungryTime / bananas;

        int oneBananasInFullTime = fullTime / bananas;

        int difference = oneBananasInFullTime - oneBananasInHungryTime;

        System.out.println("насколько быстрее голодный Вася съедает один банан? - " + difference + " минуты");

        // Задача 3. Дано: Коля получил много двоек и закопал свой дневник на 127 метров.
        // Потом вернулся и углубился еще на 2 метра. На сколько метров в итоге закопал свой дневник Коля?

        byte h1 = 127;

        int h1Plus2 = (h1 + 2);

        System.out.println(h1Plus2);

        // Задача 4. Дано: Хитрый бухгалтер разделил 5 рублей на 2 кассы. Сколько рублей лежит в каждой кассе?

        double cash = 5;

        double cashMachine1 = cash / 2;
        double cashMachine2 = cash / 2;

        System.out.println(cashMachine1 + " рубля");
        System.out.println(cashMachine2 + " рубля");

        // Задача 5. Дано: Есть 10, 3 и метод научного тыка. Найти длину после запятой float и double

        double d = 10.0 / 3;

        float f = (float) (10.0 / 3);

        System.out.println("Ответ double - " + d);
        System.out.println("Ответ float - " + f);

        // Задача 6. Дано: 10 красных и 5 зеленых яблок. Вопрос: Верно ли утверждение, что красных яблок больше?

        int redApple = 10;

        int greenApple = 5;

        // statement - утверждение (англ)
        boolean statement = redApple > greenApple;

        System.out.println("Вопрос: Верно ли утверждение, что красных яблок больше - " + statement);


    }
}
