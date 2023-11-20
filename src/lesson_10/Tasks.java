package lesson_10;

import java.util.ArrayList;

public class Tasks {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            arrayList.add(i);
        }

        for (Integer i  : arrayList) {
            System.out.println(i);
        }

        System.out.println("------------------------------------");

        ArrayList<Integer> arrayList2 = new ArrayList<>();

        for (int i = 10; i <= 20; i++) {
            arrayList2.add(i);
        }

        System.out.println(arrayList2.get(0));
        System.out.println(arrayList2.get(1));
        System.out.println(arrayList2.get(0) == arrayList2.get(1));
        System.out.println(arrayList2.get(0) % 2 == 0);
        System.out.println(arrayList2.get(5) % 2 == 0);


        System.out.println("------------------------------------");




        for (int i = 0; i < arrayList2.size(); i++) {
            if (arrayList2.get(i) % 2 == 0) {
                System.out.println(arrayList2.get(i));
            }
        }

        System.out.println("------------------------------------");

        ArrayList<Integer> arrayList3 = new ArrayList<>();

        for (int i = 1; i < 100; i++) {
            arrayList3.add(i);
        }

        for (Integer n : arrayList3) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println(n);
            }
        }


        System.out.println("------------------------------------");

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("c");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add("H");

        // C D G

        list.remove("c");
        list.remove("D");
        list.remove("G");

        System.out.println();









    }

}
