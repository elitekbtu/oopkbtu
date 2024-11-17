package lab3.problem6;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void getSound() {
        System.out.println("Woof Woof");
    }
}