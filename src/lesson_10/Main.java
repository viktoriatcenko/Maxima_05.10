package lesson_10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int[5];

        System.out.println(arr.length);

        int a = 5;
        byte c = 15;



        System.out.println(a);

        Integer b = 10;
        Byte d = 15;

        Short e = 100;
        Long l = 1L;


        System.out.println(b);

        String s = "Hello World!";


        ArrayList<Integer> list = new ArrayList<>();

        // 1 - ���������� �������� � ���������

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        //  2 - ���������� �������� � ��������� � ��������� ������� �� ������� ����
        // ������� ����� ������

        list.add(3, 10);

        // 3 - ������ ��������

        list.set(3, 20);

        // 4 - �������� ������� �� ���������
        Integer ii = 20;

        list.remove(ii);

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("AAA");
        stringArrayList.add("BBB");
        stringArrayList.add("CCC");
        stringArrayList.add("DDD");

        stringArrayList.remove("BBB");


        System.out.println(stringArrayList);

        // 5 - ������ ����� ���������

        System.out.println("Size of stringArrayList is " + stringArrayList.size());

        // 6 - ������ ����� � ������ �� �����

        System.out.println(" Third element is " + stringArrayList.get(2));

        System.out.println(stringArrayList);

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println(i +  " element is " + stringArrayList.get(i));
        }

        for (String x : stringArrayList) {
            System.out.println(x);
        }

        // 7 - ��� ������ ������ ������������� �������� � ��� ������� � ���������

        System.out.println("Element FFF has index " + stringArrayList.indexOf("FFF") + " in our collection");

        // 8 - ������ ������ ��������� ��� ���

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("AAA");
        list1.add("BBB");
        list1.add("CCC");
        list1.add("DDD");

        ArrayList<String> list2 = new ArrayList<>();

        System.out.println("Collection list1 is empty? " + list1.isEmpty());
        System.out.println("Collection list2 is empty? " + list2.isEmpty());

        // 9 - ������� ��� �������� �� ���������

        list1.clear();





        System.out.println(list);


        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println();

        ArrayList<Integer> list5 = new ArrayList<>();





    }
}
