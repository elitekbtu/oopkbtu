package lab3.problem2;

public class Bird implements Flyable {
    @Override
    public void move() {
        System.out.println("The bird is walking.");
    }

    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }
}