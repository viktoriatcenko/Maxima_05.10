package lesson_9.exceptions;

public class Dog {
    private String name;

    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isMuzzlePutOn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCollarPutOn() {
        return isCollarPutOn;
    }

    public void setCollarPutOn(boolean collarPutOn) {
        isCollarPutOn = collarPutOn;
    }

    public boolean isLeashPutOn() {
        return isLeashPutOn;
    }

    public void setLeashPutOn(boolean leashPutOn) {
        isLeashPutOn = leashPutOn;
    }

    public boolean isMuzzlePutOn() {
        return isMuzzlePutOn;
    }

    public void setMuzzlePutOn(boolean muzzlePutOn) {
        isMuzzlePutOn = muzzlePutOn;
    }

    public Dog(String name) {
        this.name = name;
    }


    public void putCollar() {
        System.out.println("������� �����");
        this.isCollarPutOn = true;
    }

    public void putLeash() {
        System.out.println("������� �����");
        this.isLeashPutOn = true;
    }

    public void putMuzzle() {
        System.out.println("��������� �����");
        this.isMuzzlePutOn = true;
    }


    public void walk() throws DogIsNotReadyException {
        System.out.println("���� �� ��������!!!");

        if (isCollarPutOn && isMuzzlePutOn && isLeashPutOn) {
            System.out.println("��, �� ������, ���� ������!");
        } else {
            throw new DogIsNotReadyException("������ �� ������");
        }
    }

}
