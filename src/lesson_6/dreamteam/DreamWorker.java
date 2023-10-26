package lesson_6.dreamteam;

public class DreamWorker {
    // 3 сущности - Фронт, Бэк, Проджектменеджер
    // Фронт -  работать, писать скрипты, получать зарплату
    // Бэк работать, записывать данные в БД, получать зарплату
    // Проджектменеджер - получать зарплату, работать

    // fields
    private String name;
    private String vacancy;

    // constructor
    public DreamWorker() {
    }

    public DreamWorker(String name, String vacancy) {
        this.name = name;
        this.vacancy = vacancy;
    }

    // methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVacancy() {
        return vacancy;
    }

    public void setVacancy(String vacancy) {
        this.vacancy = vacancy;
    }

    public void work(String work) {
        System.out.println("This person is doing " + work);
    }

    public void getSalary(int salary) {
        System.out.println(this.vacancy + " is getting " + salary + " $");
    }
}
