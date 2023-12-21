package lesson_20.blackjack.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    private List<Card> cardOnHands = new ArrayList<>();

    public void takeCard(Card card) {
        cardOnHands.add(card);
    }

    public int sumValuesOnHand() {
        int count = 0;
        for (Card card: cardOnHands) {
            count += card.getValue();
        }
        return count;
    }

    public void showCards() {
        cardOnHands.forEach(x -> System.out.println(x.getName()));
    }

    public boolean isNeedCard() {
        System.out.println("-----Ваши карты-------");
        showCards();
        System.out.println("Нужна ли вам еще одна карта?");
        Scanner scanner = new Scanner(System.in);
        if (!"да".equals(scanner.nextLine()) && !"нет".equals(scanner.nextLine())) {
            System.out.println("Я понимаю только да или нет, введите эти значения");
        }

        if ("да".equals(scanner.nextLine())) {
            return true;
        } else if ("нет".equals(scanner.nextLine())) {
            return false;
        }
        return false;
    }
}
