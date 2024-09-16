package drafts;

public class Person {
    String name;  // имя
    int age;      // возраст

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

    public static void main(String[] args) {
        Person person = new Person();  // Create an object of Person class
        person.name = "John";          // Assign values to fields
        person.age = 30;
        person.displayInfo();          // Call the non-static method on the object
    }
}
