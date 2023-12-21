package lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    private List<Card> cards = new ArrayList<>();

    public DeckOfCards() {
        cards = List.of(new Card("������ ����", 2),
                new Card("������ �����", 2),
                new Card("������ �����", 2),
                new Card("������ ����", 2),

                new Card("������ �����", 3),
                new Card("������ �����", 3),
                new Card("������ �����", 3),
                new Card("������ ����", 3),

                new Card("�������� �����", 4),
                new Card("�������� �����", 4),
                new Card("�������� �����", 4),
                new Card("�������� ����", 4),

                new Card("������� �����", 5),
                new Card("������� �����", 5),
                new Card("������� �����", 5),
                new Card("������� ����", 5),

                new Card("�������� �����", 6),
                new Card("�������� �����", 6),
                new Card("�������� �����", 6),
                new Card("�������� ����", 6),

                new Card("������� �����", 7),
                new Card("������� �����", 7),
                new Card("������� �����", 7),
                new Card("������� ����", 7),

                new Card("��������� �����", 8),
                new Card("��������� �����", 8),
                new Card("��������� �����", 8),
                new Card("��������� ����", 8),

                new Card("������� �����", 9),
                new Card("������� �����", 9),
                new Card("������� �����", 9),
                new Card("������� ����", 9),

                new Card("������� �����", 10),
                new Card("������� �����", 10),
                new Card("������� �����", 10),
                new Card("������� ����", 10),

                new Card("����� �����", 10),
                new Card("����� �����", 10),
                new Card("����� �����", 10),
                new Card("����� ����", 10)

                , new Card("���� �����", 10)
                , new Card("���� �����", 10)
                , new Card("���� �����", 10)
                , new Card("���� ����", 10)

                , new Card("������ �����", 10)
                , new Card("������ �����", 10)
                , new Card("������ �����", 10)
                , new Card("������ ����", 10)

                , new Card("��� �����", 11)
                , new Card("��� �����", 11),
                new Card("��� �����", 11),
                new Card("��� ����", 11));
    }

    public Card getRandomCard() {
        Random random = new Random();
        return cards.get(random.nextInt(0, 51));
    }
}
