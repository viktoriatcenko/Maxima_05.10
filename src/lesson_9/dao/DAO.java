package lesson_9.dao;

public interface DAO {
    Human create(Human humman);
    Human read (String name);
    Human update(Human human);
    void delete(Human human);
}
