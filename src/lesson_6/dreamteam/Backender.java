package lesson_6.dreamteam;

public class Backender extends DreamWorker {
    // 3 сущности - Фронт, Бэк, Проджектменеджер
    // Фронт -  работать, писать скрипты, получать зарплату
    // Бэк работать, записывать данные в БД, получать зарплату
    // Проджектменеджер - получать зарплату, работать


    public Backender(String name, String vacancy) {
        super(name, vacancy);
    }

    public void writtingCode() {
        System.out.println("Пишу код на Java");
    }
}
