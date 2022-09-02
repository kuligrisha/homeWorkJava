import java.util.Arrays;
import java.util.List;

public abstract class Animal {

    protected String name;
    protected int age;
    protected int weight;
    protected String color;

    public Animal(String name, int age, int weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    // ������� � �������
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //������
    public void say() {
        System.out.println("� ������");
    }

    public void go() {
        System.out.println("� ���");
    }

    public void drink() {
        System.out.println("� ���");
    }

    public void eat() {
        System.out.println("� ��");
    }

    String generate() {
        int ageLastNumber = age % 100;
        String old = "";
        if (ageLastNumber == 1 && ageLastNumber != 11)
            old = " ���";
        else if ((ageLastNumber == 2 || ageLastNumber == 3 || ageLastNumber == 4) &&
                (ageLastNumber != 12 || ageLastNumber != 13 || ageLastNumber != 14)) {
            old = " ����";
        }
        else old = " ���";
        return old;
    }

    @Override
    public String toString() {
        return "������! ���� ����� " + name + ", ��� " + age + generate() + ", � ���� " + weight + " ��, ��� ���� " + color;
    }

}

//        if (ageLastNumber == 1 && age > 10 && age < 20)
//            old = " ���";
//        else if (ageLastNumber == 1)
//            old = " ���";
//        else if (ageLastNumber == 0 || ageLastNumber >= 5 && ageLastNumber <= 9)
//            old = " ���";
//        else if (ageLastNumber >= 2 && ageLastNumber <= 4)
//            old = " ����";
//        else {
//            old = " ���";