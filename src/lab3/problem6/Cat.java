package lab3.problem6;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void getSound() {
        System.out.println("Meow");
    }
}