package lesson_15;

import lesson_11.coins.Coin;
import lesson_8.singleton.Cat;

import java.lang.reflect.Field;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException {
        Cat pushokSeryi = Cat.getCat();



        System.out.println(pushokSeryi.getName());
        System.out.println(pushokSeryi.getName());
        System.out.println(pushokSeryi.getName());

        Cat pushokBelyi = Cat.getCat();


        // Название класса
        // Название пакета
        // Поля
        // Методы

        // name
        // packageName
        // listOfAttributes
        // listOfMethods

        Coin coin1 = new Coin();

        Class<Coin> coin = Coin.class;

        System.out.println(coin.getName());

        Class c = coin1.getClass();

        System.out.println(c.getName());

        Class<?> c2 = Class.forName("lesson_11.coins.Coin");

        System.out.println(c2.getName());

//        Method[] methods = coin.getMethods();
//
//        for (Method method : methods) {
//            System.out.println(method.getName());
//            System.out.println(method.getReturnType());
//            if (method.getDefaultValue() != null) {
//                System.out.println(method.getDefaultValue());
//            }
//        }

        Field[] declaredFields = coin.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            declaredField.set(String.class, "newValue");
        }



    }
}

//class Class {
//    String name;
//    String packageName;
//    List<Attribute> attributes;
//    List<Method> methods;
//}
