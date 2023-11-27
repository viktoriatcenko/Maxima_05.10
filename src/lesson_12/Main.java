package lesson_12;

import lesson_12.football.Team;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 1 - Добавление элементов
        hashMap.put("Zenith", 20);
        hashMap.put("Spartak", 18);
        hashMap.put("Rubin", 15);
        hashMap.put("Rubin", 333);
        hashMap.put("Rubin11", null);
        hashMap.put("Rubin22", null);
        hashMap.put("Lokomotiv", 10);
        hashMap.put(null, 111);

        // 2 - Проверка наличия ключа

        System.out.println(hashMap.containsKey("Zenith"));
        System.out.println(hashMap.containsKey("CSKA"));

        // 3 - Проход по коллекции
//        ArrayList<String> list = new ArrayList<>();
//        list.add("А");
//
//        for (String s : list) {
//
//        }

        HashMap<String, Team> table = new HashMap<>();

        table.put("Zenith", new Team(30, 20, 21));
        table.put("Spartak", new Team(25, 20, 31));
        table.put("Rubin", new Team(35, 20, 27));

        for (Map.Entry<String, Team> e : table.entrySet()) {
            System.out.println(e.getKey() + " \n Games: " + e.getValue().getGames()
                    + " \n Score: " + e.getValue().getScore()
                    + " \n Goals: " + e.getValue().getGoals());
        }

        // 4 -Печать ключей

        for (String s: table.keySet()) {
            System.out.println(s + ";");
        }

        // 5 - Вернуть значение по ключу

        for (String s: table.keySet()) {
            System.out.println("Goals of " + s + " = " + table.get(s).getGoals() +  ";");
        }

        // 6 - Удаление

        table.remove("Zenith");



















        System.out.println();
    }
}
