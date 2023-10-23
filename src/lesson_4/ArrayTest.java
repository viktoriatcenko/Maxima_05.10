package lesson_4;

import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {

        int size = 10;

        int ageOfViktor = 32;
        int ageOfAirat = 25;
        int ageOfTagir = 22;
        int ageOfOleg = 49;

        int [] array1 = {11, 22, 33, 44, 55};
        char data[] = {'a', 'b', 'c'};

        System.out.println();

        int [] ages = {ageOfViktor, ageOfAirat, ageOfOleg, ageOfTagir};

        System.out.println();


        int [] array2 = new int[5];

        array2[0] = 111;
        array2[1] = 222;
        array2[2] = 333;
        array2[3] = 444;
        array2[4] = 555;

//        for (int i = 0; i < 5; i++) {
//            System.out.println(array2[i]);
//        }


        int [] array3 = new int[size];

        int lengthOfArray = array3.length;

//        System.out.println("Длина массива равна " + lengthOfArray);
//
//        for (int i = 0; i < 10; i++) {
//            array3[i] = i;
//        }
//
//        for (int i = 0; i < array3.length; i++) {
//            System.out.println(array3[i]);
//        }





//        int [] array4 = new int[10];
//
//        int counter = 0;
//
//        for (int i = 0; i <= 50; i++) {
//            if (i % 5 == 0 && i != 0) {
//                array4[counter] = i;
//                counter++;
//            }
//        }
//
//
//        for (int i = 0; i < array4.length; i++) {
//            System.out.println(array4[i]);
//        }

//        int [] array5 = new int[10];
//
//        int a = 90;
//
//        for (int i = 0; i < array5.length; i++) {
//            array5[i] = a++;
//        }
//
//
//        for (int element : array5) {
//            System.out.println(element);
//        }
        
//
//        for (int i = 0; i < array5.length; i++) {
//            System.out.println(array5[i]);
//        }

//        int [] array6 = new int[10];
//
//        int counter = 0;
//
//        for (int i = 1; i <= 20 ; i++) {
//            if (i % 2 == 0) {
//                array6[counter] = i;
//                counter++;
//            }
//        }
//
//        for (int i = 0; i < array6.length; i++) {
//            System.out.println(array6[i]);
//        }
//
//
//
//
//
//
//
//
//
//        //                0   1    2   3   4
//        int [] array10 = {11, 22, 33, 44, 55};
//
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(array10[i]);
//        }






//        System.out.println(array10[3]);
//
//        System.out.println(array10[4]);
//
//        System.out.println(array10[5]);
















//        for (int i = 0; i < array6.length; i++) {
//            System.out.println(array6);
//        }


//        int [] arr = new int[3];
//
//        arr[0] = 2;
//        arr[2] = 5;
//
//        arr[4] = 10;

//
//
//
//
//
//
//
//
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        int [] array7 = new int[5];

//        array7[0] = scanner.nextInt();
//        array7[1] = scanner.nextInt();


//        for (int i = 0; i < 5; i++) {
//            System.out.println("Текущее значение i = " + i);
//            array7[i] = scanner.nextInt();
//        }
//
//        for (int i = 0; i < array7.length; i++) {
//            System.out.println(array7[i]);
//        }
//
//
//        System.out.println();


//        int [] lenina = new int[10];
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < lenina.length; i++) {
//            lenina[i] = scanner.nextInt();
//        }
//
//        int nechetnye = 0;
//        int chetnye = 0;
//
//
//
//        for (int i = 0; i < lenina.length; i++) {
//            if (i % 2 == 0) {
//                chetnye = lenina[i] + chetnye; // chetnye += lenina[i];
//            } else  {
//                nechetnye = lenina[i] + nechetnye;
//            }
//        }
//
//        if (chetnye > nechetnye) {
//            System.out.println("Четных больше чем нечетных");
//        } else if (chetnye < nechetnye) {
//            System.out.println("НеЧетных больше чем четных");
//        } else {
//            System.out.println("Их одинаковое кол-во");
//        }


        
        
        int [] array = new int[50];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        System.out.println();


//        for (int a : array) {
//            System.out.println(a);
//        }

//        for (int a: array) {
//            if (a % 2 == 0) {
//                System.out.println(a);
//            }
//        }

//        for (int a  : array ) {
//            if (a % 3 == 0) {
//                System.out.println(a);
//            }
//        }
        //   1 - тип переменных, который хранится в массиве
        //   2 - алиас (кличка) (имя переменной)
        //   3 - за двоеточием ставим название массива

//        for (int element  : array  ) {
//            if (element % 5 == 0 && element != 0 && element != 45) {
//                System.out.println(element);
//            }
//        }
        // kratno 5 !0 bolshe 20 i menshe ili ravno 45

        for (int element : array) {
            if (element % 5 == 0 && element > 20 && element <= 45) {
                System.out.println(element);
            }
        }




        














    }
}
