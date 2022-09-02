import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Animal animalGenerate(String anyAnimal, Scanner sc) {
        Animal animal;
        System.out.println("Введите имя");
        String name = sc.next();
        System.out.println("Введите возраст");
        int age = sc.nextInt();
        System.out.println("Введите вес");
        int weight = sc.nextInt();
        System.out.println("Введите цвет");
        String color = sc.next();
        switch (anyAnimal) {
            case "cat":
                animal = new Cat(name, age, weight, color);
                break;
            case "dog":
                animal = new Dog(name, age, weight, color);
                break;
            case "duck":
                animal = new Duck(name, age, weight, color);
                break;
            default:
                return null;
        }
        return animal;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command ");
            Commands userChoice = Commands.valueOf(sc.next().toUpperCase().trim());

            switch (userChoice) {
                case ADD:
                    System.out.println("Какое животное(cat/dog/duck)?");
                    String animalType = sc.next();
                    if(animalType.equals("cat") || animalType.equals("dog") || animalType.equals("duck")) {
                        Animal animal = animalGenerate(animalType, sc);
                        animal.say();
                        animals.add(animal);
                    }
                    break;
                case LIST:
                    for (Animal animal : animals) {
                        System.out.println(animal);
                    }
                    break;
                case EXIT:
                    System.exit(0);
                    break;
            }
        }

    }


}
