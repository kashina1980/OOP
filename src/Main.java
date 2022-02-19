
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иван", "Петрович", "Сидоров");
        person1.printName();

        Person person2 = new Person("Ирина", "Павловна", "Соколова");

        person1.setName("Павел");
        person1.printName();

        System.out.println("Человек2: " + person2);
        person2.getAge();

        System.out.println(person2 + " родилась в " + person2.YearBirth() + " году");

    }
}