package lesson_13;


import lesson_6.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestCat {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("Snezhok", 5, "Pers", "White"),
                new Cat("Pushistic", 10, "Britain", "Black"),
                new Cat("Pushok", 11, "Street", "Ginger"),
                new Cat("Ryzhik", 7, "Street", "Ginger"),
                new Cat("Klubok", 15, "Siberian", "Blue")
        );

//        cats.stream()
//                .filter(cat -> cat.getBreed().equals("Street"))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        cats.stream()
//                .sorted(Comparator.comparing(Cat::getAge))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        Cat cat = cats.stream()
//                .min(Comparator.comparing(Cat::getAge))
//                .get();
//        System.out.println(cat);

        Cat cat = cats.stream()
                .max(Comparator.comparing(Cat::getAge))
                .get();
        System.out.println(cat);


    }
}
