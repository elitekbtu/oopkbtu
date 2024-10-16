package Lab2.problem5;

public class Bird extends Animal {
    public Bird(String name, int age) {
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
        System.out.println("Tweet");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bird)) return false;
        if (!super.equals(obj)) return false;

        return true;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }
}