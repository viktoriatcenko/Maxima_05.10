package lesson_6.dreamteam;

public class Main {
    public static void main(String[] args) {
        // 3 �������� - �����, ���, ����������������
        // ����� - ������ ���, ������ �������, �������� ��������
        // ��� ������ ���, ���������� ������ � ��, �������� ��������
        // ���������������� - �������� ��������, ���������� ��
        Fronteder fronteder = new Fronteder("Vasiliy" , "frontender");
        Backender backender = new Backender("Dmitriy", "java-developer");
        ProjectManager projectManager = new ProjectManager("Viktor", "analytic");

        fronteder.writtingScrypts();
        fronteder.getSalary(1000);

        backender.writtingCode();
        backender.work("Spring Application");
        backender.getSalary(1500);

        projectManager.work("Analysing data");
        projectManager.getSalary(700);

    }
}
