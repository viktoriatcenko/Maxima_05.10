package lesson_6.dreamteam;

public class Main {
    public static void main(String[] args) {
        // 3 сущности - Фронт, Бэк, Проджектменеджер
        // Фронт - писать код, писать скрипты, получать зарплату
        // Бэк писать код, записывать данные в БД, получать зарплату
        // Проджектменеджер - получать зарплату, составлять ТЗ
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
