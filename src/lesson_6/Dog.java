package lesson_6;

public class Dog {

    // fields
    private String name;
    private int speed;
    private int height;
    private Cat friend;

    // constructor
    public Dog() {
    }

    public Dog(String name, int speed, int height) {
        this.name = name;
        this.speed = speed;
        this.height = height;
    }

    // getters and setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Cat getFriend() {
        return friend;
    }

    public void setFriend(Cat friend) {
        this.friend = friend;
    }
}
