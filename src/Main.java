import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person person1 = new Person("Иван", "Петрович", "Сидоров");
        person1.printName();

        Person person2 = new Person("Ирина", "Павловна", "Соколова");

        person1.setName("Павел");
        person1.printName();

        System.out.println("Человек2: " + person2);

        System.out.println(person2+ " укажите свой возраст:");
        person2.setAge(scanner.nextInt());

        System.out.println(person2 + " родилась в " + person2.YearBirth() + " году");

    }
}