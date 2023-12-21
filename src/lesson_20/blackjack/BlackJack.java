package lesson_20.blackjack;

import lesson_20.blackjack.model.Croupier;
import lesson_20.blackjack.model.Game;
import lesson_20.blackjack.model.Player;

public class BlackJack {
    public static void main(String[] args) {
        /**
         * ���� BlackJack
         * ���� ����������� � ���, ����� ������� ��� ����� ������ �����, �� �� ����� 21 � �������� ����� ������.
         * � ���� ������������ �� ����� �� ������ �����. ��-�� ���� ��� ����������� ���������� ����-���� ��� �������
         * ����� ����� ����, �� ������������ ������ ����������� ��� ���������� ����� �����. ��� ���� � �����-��������
         * ���������, ��� ������������ ����������� ������.
         *
         * �������� ����� ������ �����:
         *      �� ������ �� ������� � �� 2 �� 10 ��������������;
         *      � ���� � 1 ��� 11 (11 ���� ����� ����� �� ������ 21, ����� 1);
         *      � �. �. �������� (������, ����, �����) � 10;
         *
         * ���� � ������ � ������ ����� ����� �� ����� ������, �� ����� �������� ���������� ������: �� ������� ���
         * ���������� � ��� (����. push). � ����� �������� ��� �������� ��� ����� �������, ����� �� ���������� � ��
         * �����������. ���� � ������ ������ ����������, � ��� �push� ���������� ������
         */

        /**
         * 1. ������� ���� - Game
         * 2. ������� ������� - Player
         * 3. ������� ������ - Croupier
         * 4. ������� ������� � ������ � ����
         * 5. ������� ������ ���� - DeckOfCards
         * 6. ������� ����� � ������ - Card
         * 7. ������� �� 2 ����� ������� ������
         * 8. ��������� �� ����� ����� ���� ���������
         * 9. ����������� ����������
         */

        Game game = new Game();
        Player player1 = new Player();
        Player player2 = new Player();

        Croupier croupier = new Croupier();

        game.addPlayer(player1);
        game.addPlayer(player2);
        game.addPlayer(croupier);

        game.giveTwoRandomCardsEachPlayerOnStart();

        game.oneCardIfPlayerNeed();

        game.determineWinner();
    }
}
