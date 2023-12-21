package lesson_13;


import lesson_6.Cat;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCat {
    public static void main(String[] args) {
        List<Cat> cats = List.of(
                new Cat("Snezhok", 5, "Pers", "White"),
                new Cat("Pushistic", 5, "Britain", "White"),
                new Cat("Pushok", 5, "Street", "Ginger"),
                new Cat("Ryzhik", 5, "Street", "Ginger"),
                new Cat("Klubok", 5, "Siberian", "Blue")
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

//        Cat cat = cats.stream()
//                .max(Comparator.comparing(Cat::getAge))
//                .get();
//        System.out.println(cat);

        boolean b = cats.stream()
                .allMatch(cat -> cat.getAge() == 5);

        boolean b1 = cats.stream()
                .noneMatch(cat -> cat.getBreed().equals("Forest"));

        Map<String, List<Cat>> collect = cats.stream()
                .collect(Collectors.groupingBy(Cat::getColor));

        System.out.println(collect);

        System.out.println(b1);


    }
}
