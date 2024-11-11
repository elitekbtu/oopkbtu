package lab2.problem5;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void getSound();

    @Override
    public String toString() {
        return "Animal: " + name + ", Age: " + age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Animal)) return false;
        Animal other = (Animal) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }
}