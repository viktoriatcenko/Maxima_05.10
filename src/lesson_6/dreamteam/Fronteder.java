package lesson_6.dreamteam;

public class Fronteder extends DreamWorker {
    // 3 сущности - Фронт, Бэк, Проджектменеджер
    // Фронт -  работать, писать скрипты, получать зарплату
    // Бэк работать, записывать данные в БД, получать зарплату
    // Проджектменеджер - получать зарплату, работать


    public Fronteder(String name, String vacancy) {
        super(name, vacancy);
    }

    public void writtingScrypts() {
        System.out.println("Пишу скрипты на JavaScrypt");
    }
}
