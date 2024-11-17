package lab3.problem6;

public abstract class Person implements Assignable, Describable, Comparable<Person>, Cloneable {
    private String name;
    private int age;
    protected Animal pet = null;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    @Override
    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String getDescription() {
        return "Name: " + this.name + ", Age: " + this.age + ", Pet: " + (this.pet != null ? this.pet.getName() : "No pet");
    }

    @Override
    public String toString() {
        return getDescription();
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}