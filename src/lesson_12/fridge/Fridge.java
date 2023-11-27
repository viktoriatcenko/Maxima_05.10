package lesson_12.fridge;

import java.util.HashMap;
import java.util.Scanner;

public class Fridge {
    HashMap<String , Integer> products = new HashMap<>();


    public void addProducts(String name, Integer count) {
        if (products.containsKey(name)) {
            Integer alreadyInFridge = products.get(name);
            products.put(name, alreadyInFridge + count);
        } else {
            products.put(name, count);
        }
    }


    // name - это имя продукта (ключ), какой продукт хотят забрать из холодильника
    // count - это сколько в штуках хотят забрать
    public void take(String name, Integer count) {
        // Если продукта в холодильнике нет
        if (!products.containsKey(name)) {
            System.out.println(name + " в холодильнике нет");
            return;
        }

        // Если продукта в холодильнике не хватает

        // alreadyInFridge - сколько у нас уже есть этого продукта по имени (ключу) в нашем холодильнике
        Integer alreadyInFridge = products.get(name);
        if (alreadyInFridge < count) {
            System.out.println("Вы хотите забрать " + count + ". У нас столько нет. Есть только " + alreadyInFridge);
            while (true) {
                System.out.println("Сколько вы хотите забрать?");
                Scanner scanner = new Scanner(System.in);
                Integer takeCount = scanner.nextInt();
                if (takeCount > alreadyInFridge) {
                    System.out.println("Вы хотите забрать " + name + " " + takeCount + ". У нас столько нет. Есть только " + alreadyInFridge);
                } else if (takeCount < alreadyInFridge) {
                    products.put(name, alreadyInFridge - takeCount);
                    break;
                } else {
                    products.remove(name);
                    break;
                }
            }
        }
    }

    public void all() {
        for (String s : products.keySet()) {
            System.out.println(s + " : " + products.get(s));
        }
    }



}
