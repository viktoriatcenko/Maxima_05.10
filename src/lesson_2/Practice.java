package lesson_2;

public class Practice {
    public static void main(String[] args) {
        // �������������� ���������

        /**
         �������������� ���������
         +	���������� �������� �� ��� ������� �� ���������
         -	�������� ������ ������� �� ������ ��������
         *	�������� �������� �� ��� ������� �� ���������
         /	�������� ������� ����� ����� ������� �� ������ �������
         %	����� ����� ������� �� ������ ������� � ���������� �������
         ++	��������� - ����������� �������� �������� �� 1 �++ �����������, ++� ����������
         --	��������� - ��������� �������� �������� �� 1	�-- �����������, --� ����������
         * */

//        int a = 10; // 10 / 3 = 3
//
//        int b = 3;
//
//        int c = a % b;
//
//        int d = a % 2;
//
//        int e = 5;
//
//        e--; // e = e + 1;
//
//        System.out.println(e);

        // ������ 1. ����: a = 60, b = 45, c = 17. ����� �������� ������������

        int a = 60;

        int b = 45;

//        int c = 17;

//        int perimeterDamira = a + b + c;

//        System.out.println(perimeterDamira);

        int e = 50;

//        int f = 100;
//
//        int summa = e + f;
//
//        System.out.println(summa);

        // ������ 2. ����: �������� ���� ������� �� 9 ����� 3 ������, � ����� �� 15 �����,
        //  ��������� ������� �������� ���� ������� ���� �����?

        byte hungryTime = 9;

        int fullTime = 15;

        int bananas = 3;

        int oneBananasInHungryTime = hungryTime / bananas;

        int oneBananasInFullTime = fullTime / bananas;

        int difference = oneBananasInFullTime - oneBananasInHungryTime;

        System.out.println("��������� ������� �������� ���� ������� ���� �����? - " + difference + " ������");

        // ������ 3. ����: ���� ������� ����� ����� � ������� ���� ������� �� 127 ������.
        // ����� �������� � ��������� ��� �� 2 �����. �� ������� ������ � ����� ������� ���� ������� ����?

        byte h1 = 127;

        int h1Plus2 = (h1 + 2);

        System.out.println(h1Plus2);

        // ������ 4. ����: ������ ��������� �������� 5 ������ �� 2 �����. ������� ������ ����� � ������ �����?

        double cash = 5;

        double cashMachine1 = cash / 2;
        double cashMachine2 = cash / 2;

        System.out.println(cashMachine1 + " �����");
        System.out.println(cashMachine2 + " �����");

        // ������ 5. ����: ���� 10, 3 � ����� �������� ����. ����� ����� ����� ������� float � double

        double d = 10.0 / 3;

        float f = (float) (10.0 / 3);

        System.out.println("����� double - " + d);
        System.out.println("����� float - " + f);

        // ������ 6. ����: 10 ������� � 5 ������� �����. ������: ����� �� �����������, ��� ������� ����� ������?

        int redApple = 10;

        int greenApple = 5;

        // statement - ����������� (����)
        boolean statement = redApple > greenApple;

        System.out.println("������: ����� �� �����������, ��� ������� ����� ������ - " + statement);


    }
}
