package Lab2.problem5;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void getSound() {
        System.out.println("Blub");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Fish)) return false;
        if (!super.equals(obj)) return false;

        return true;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}