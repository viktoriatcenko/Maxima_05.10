package lesson_3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /**
         ��������� ���������

         ==	���������, ����� ��� ��� �������� ���� ���������, ���� ��,
         �� ������� ���������� ��������	(A == B) � �� �����

         !=	���������, ����� ��� ��� �������� ���� ���������,
         ���� �������� �� �����, �� ������� ���������� ��������	(A != B) � �������� �������

         >	���������, �������� �� �������� ������ �������� ������,
         ��� �������� ������� ��������, ���� ��, �� ������� ���������� ��������	(A > B) � �� �����

         <	���������, �������� �� �������� ������ �������� ������,
         ��� �������� ������� ��������, ���� ��, �� ������� ���������� ��������	(A < B) � �������� �������

         >=	���������, �������� �� �������� ������ �������� ������ ��� ����� �������� ������� ��������,
         ���� ��, �� ������� ���������� ��������	(A >= B) � �������� �� �����

         <=	���������, ���� �������� ������ �������� ������ ��� ����� �������� ������� ��������,
         ���� ��, �� ������� ���������� ��������	(A <= B) � �������� �������
         * */


        int a = 10;

        int b = 10;

        boolean c = a == b;

//        System.out.println(c);

        /**
         ���������� ���������
         &&	���������� ���������� �������� �Ȼ. ���� ��� �������� �������� �� ����� ����, �� ������� ���������� ��������
         ||	���������� ���������� �������� ���Ȼ. ���� ����� �� ���� ��������� �� ����� ����, �� ������� ���������� ��������
         !	���������� ���������� �������� ��Ż. ������������� ������ ���������� ��������� ������ ��������.
         ���� ������� ����� �������� true, �� �������� ����������� ��Ż ����� ������ false
         * */
        // 2 ������� - ���� ��� ���������, ����� true, �� ���� ���� �� ��� �� ���������, ����� false
        boolean bool1 = 10 > 5 && 15 < 10;

        // 2 ������� - ���� ���� �� ���� �� ��� true, ����� true
        boolean bool2 = 100 > 50 || 50 > 100;

//        System.out.println(!bool2);


        /**
         if (�������) {
         //��������(-�), ������� �����������, ���� ������� �������;
         }
         else {
         //��������(-�), ������� �����������, ���� ������� �������;
         }
         * */

        int age = 11;

        if (age > 14) {
            System.out.println("��, ��������� �� �����");
        } else {
            System.out.println("���, �� ����� ������");
        }


        int height = 125;

        if (height > 125 && height < 220) {
            System.out.println("��, ����� �� ������������ �����");
        } else {
            System.out.println("���, ������ �� ���������� ��������");
        }


//        int day = 5;

//        if (day == 1) {
//            System.out.println("������� �����������");
//        } else if (day == 2) {
//            System.out.println("������� �������");
//        } else if (day == 3) {
//            System.out.println("������� ��");
//        } else if (day == 4) {
//            System.out.println("������� ��");
//        } else if (day == 5) {
//            System.out.println("������� ��");
//        } else if (day == 6) {
//            System.out.println("������� ��");
//        } else if (day == 7) {
//            System.out.println("������� ��");
//        } else {
//            System.out.println("������� ����������� ����");
//        }

























        int rate = 7;

        if (rate == 5) {
            System.out.println("�������");
        } else if (rate == 4) {
            System.out.println("������");
        } else if (rate == 3) {
            System.out.println("���");
        } else if (rate == 2) {
            System.out.println("�����");
        } else if (rate == 1) {
            System.out.println("�������������");
        } else {
            System.out.println("������ ��� ����������");
        }







        int s = 35;

        // if (s > 50 && s < 100)
        if (s < 49 || s > 100) {
            System.out.println("��� ����� �� ��������");
        } else {
            System.out.println("��� ����� ��������");
        }


        /**
         switch (������������������) {
         case  (��������1):
         ���1;
         break;
         case (��������2):
         ���2;
         break;
         ...
         case (��������N):
         ���N;
         break;
         default:
         ��������������������;
         break;
         }
         * */

        int number = 10;
        System.out.println();

//        Scanner scan = new Scanner(System.in);

//        int day = scan.nextInt();
//
//
//        switch (day) {
//            case (1) :
//                System.out.println("������� �����������");
//                break;
//            case (2) :
//                System.out.println("������� �������");
//                break;
//            case (3) :
//                System.out.println("������� ��");
//                break;
//            case (4) :
//                System.out.println("������� ��");
//                break;
//            case (5) :
//                System.out.println("������� ��");
//                break;
//            case (6) :
//                System.out.println("������� ��");
//                break;
//            case (7) :
//                System.out.println("������� ��");
//                break;
//            default:
//                System.out.println("������� ����������� ����");
//                break;
//        }



        Scanner scanner = new Scanner(System.in);

        int temp = scanner.nextInt();

        switch (temp) {
            case (-15) :
                System.out.println("������� �������");
                break;
            case (0) :
                System.out.println("������� ���������");
                break;
            case (15) :
                System.out.println("������� �����");
                break;
            default:
                System.out.println("������� ���������� ������");
                break;
        }

    }
}
