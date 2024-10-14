package Lab2.problem5;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void getSound() {
        System.out.println("Woof");
    }
}