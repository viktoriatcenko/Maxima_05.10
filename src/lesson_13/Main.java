package lesson_13;

import lesson_6.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        Box<Integer> integerBox = new Box<>(111);

        int value = integerBox.getItem();

        System.out.println(value);

        Box<String> stringBox = new Box<>("Hello World");

        String hello = stringBox.getItem();

        System.out.println(hello);

        Box<Cat> catBox = new Box<>(new Cat(10, "Snezhok"));

        Cat cat = catBox.getItem();

        System.out.println("Кота зовут " + cat.getName());


        List<String> s = new ArrayList<>();

        s = new LinkedList<>();



//         Upcasting
        List<Long> integers = new ArrayList<>();

        List<? extends Number> numbers1 = integers;

        // Downcasting

        List<? extends Number> numbers2 = new ArrayList<>();

        List<Byte> bytes = (List<Byte>) numbers2;

        List<? super Integer> intList = new ArrayList<>();


















































    }
}
