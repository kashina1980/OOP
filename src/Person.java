import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String name;
    private String middleName;
    private String familyName;
    private int age;

    public Person(String name, String middleName, String familyName) {
        this.familyName = familyName;
        this.name = name;
        this.middleName = middleName;
    }

    public void printName() {
        System.out.println("Имя: " + name);
    }

    public int YearBirth() {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        return currentYear - age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2) {
            this.name = name;
        }
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(toString() + " укажите свой возраст:");
        return age = scanner.nextInt();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return familyName + " " + name + " " + middleName;
    }
}
