package lab3.problem6;

public class Tester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Kitty", 2);
        Person student = new Student("Alice", 20);
        student.assignPet(dog);
        System.out.println(student);
        student.removePet();
        System.out.println(student);

        Animal clonedDog = (Animal) dog.clone();
        System.out.println("Cloned Dog: " + clonedDog);

        System.out.println("Comparing Dog and Cat by age: " + dog.compareTo(cat));

        Person clonedStudent = (Person) student.clone();
        System.out.println("Cloned Person: " + clonedStudent);
    }
}
