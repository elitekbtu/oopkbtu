package practice3;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Female", 3, "Barsik", "German dog");

        System.out.println("Gender: " + dog.getGender());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Name: " + dog.getName());
        System.out.println("Breed: " + dog.getBreed());
        dog.setGender("Male");
        dog.setAge(5);
        dog.setName("Rex");
        dog.setBreed("Bulldog");

        System.out.println(dog.toString());
    }
}