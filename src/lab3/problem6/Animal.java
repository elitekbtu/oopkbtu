package lab3.problem6;

public abstract class Animal implements Describable, Comparable<Animal>, Cloneable {
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
    public String getDescription() {
        return "Animal: " + name + ", Age: " + age;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
