package Lab2.problem5;

import java.util.Objects;

public class PhDStudent extends Person {
    private String science;

    public PhDStudent(String name, int age, String science) {
        super(name, age);
        this.science = science;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public boolean hasPet() {
        return super.hasPet();
    }

    @Override
    public void assignPet(Animal pet) {
        super.assignPet(pet);
    }

    @Override
    public void removePet() {
        super.removePet();
    }

    @Override
    public String getOccupation() {
        return "PhD Student";
    }

    @Override
    public boolean leavePetWith(Person otherPerson) {
        return super.leavePetWith(otherPerson);
    }

    @Override
    public boolean retrievePetFrom(Person otherPerson) {
        return super.retrievePetFrom(otherPerson);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PhDStudent that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(science, that.science);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), science);
    }

    @Override
    public String toString() {
        return super.toString() + ", Science: " + this.science;
    }
}