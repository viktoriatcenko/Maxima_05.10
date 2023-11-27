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


    // name - ��� ��� �������� (����), ����� ������� ����� ������� �� ������������
    // count - ��� ������� � ������ ����� �������
    public void take(String name, Integer count) {
        // ���� �������� � ������������ ���
        if (!products.containsKey(name)) {
            System.out.println(name + " � ������������ ���");
            return;
        }

        // ���� �������� � ������������ �� �������

        // alreadyInFridge - ������� � ��� ��� ���� ����� �������� �� ����� (�����) � ����� ������������
        Integer alreadyInFridge = products.get(name);
        if (alreadyInFridge < count) {
            System.out.println("�� ������ ������� " + count + ". � ��� ������� ���. ���� ������ " + alreadyInFridge);
            while (true) {
                System.out.println("������� �� ������ �������?");
                Scanner scanner = new Scanner(System.in);
                Integer takeCount = scanner.nextInt();
                if (takeCount > alreadyInFridge) {
                    System.out.println("�� ������ ������� " + name + " " + takeCount + ". � ��� ������� ���. ���� ������ " + alreadyInFridge);
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
