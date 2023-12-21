package lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private List<Card> cards = new ArrayList<>();

    public DeckOfCards() {
        cards = List.of(new Card("Двойка треф", 2),
                new Card("Двойка Черви", 2),
                new Card("Двойка Бубны", 2),
                new Card("Двойка Пики", 2),

                new Card("Тройка Трефа", 3),
                new Card("Тройка Черви", 3),
                new Card("Тройка Бубны", 3),
                new Card("Тройка Пики", 3),

                new Card("Четверка Трефа", 4),
                new Card("Четверка Черви", 4),
                new Card("Четверка Бубны", 4),
                new Card("Четверка Пики", 4),

                new Card("Пятерка Трефа", 5),
                new Card("Пятерка Черви", 5),
                new Card("Пятерка Бубны", 5),
                new Card("Пятерка Пики", 5),

                new Card("Шестерка Трефа", 6),
                new Card("Шестерка Черви", 6),
                new Card("Шестерка Бубны", 6),
                new Card("Шестерка Пики", 6),

                new Card("Семерка Трефа", 7),
                new Card("Семерка Черви", 7),
                new Card("Семерка Бубны", 7),
                new Card("Семерка Пики", 7),

                new Card("Восьмерка Трефа", 8),
                new Card("Восьмерка Черви", 8),
                new Card("Восьмерка Бубны", 8),
                new Card("Восьмерка Пики", 8),

                new Card("Девятка Трефа", 9),
                new Card("Девятка Черви", 9),
                new Card("Девятка Бубны", 9),
                new Card("Девятка Пики", 9),

                new Card("Десятка Трефа", 10),
                new Card("Десятка Черви", 10),
                new Card("Десятка Бубны", 10),
                new Card("Десятка Пики", 10),

                new Card("Валет Трефа", 10),
                new Card("Валет Черви", 10),
                new Card("Валет Бубны", 10),
                new Card("Валет Пики", 10)

                , new Card("Дама Трефа", 10)
                , new Card("Дама Черви", 10)
                , new Card("Дама Бубны", 10)
                , new Card("Дама Пики", 10)

                , new Card("Король Трефа", 10)
                , new Card("Король Черви", 10)
                , new Card("Король Бубны", 10)
                , new Card("Король Пики", 10)

                , new Card("Туз Трефа", 11)
                , new Card("Туз Черви", 11),
                new Card("Туз Бубны", 11),
                new Card("Туз Пики", 11));
    }

    public Card getRandomCard() {
        Random random = new Random();
        return cards.get(random.nextInt(0, 51));
    }
}
