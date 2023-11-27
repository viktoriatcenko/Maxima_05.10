package lesson_12;

import java.util.HashMap;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 1 - Добавление элементов
        hashMap.put("Zenith", 20);
        hashMap.put("Spartak", 18);
        hashMap.put("Rubin", 15);
        hashMap.put("Rubin", 333 + hashMap.get("Rubin"));
        hashMap.put("Rubin11", null);
        hashMap.put("Rubin22", null);
        hashMap.put("Lokomotiv", 10);
        hashMap.put(null, 111);

        // 2 - Проверка наличия ключа

        System.out.println(hashMap.containsKey("Zenith"));
        System.out.println(hashMap.containsKey("CSKA"));

        for ( String k : hashMap.keySet()) {
            System.out.println(k);
            System.out.println(hashMap.get(k));
        }








        boolean goodWeather = false;


        if (goodWeather) {
            System.out.println("Я иду гулять");
        } else if (!goodWeather) {
            System.out.println("Я остаюсь дома");
        }



    }
}
