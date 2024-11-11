package lab2.problem5;

import java.util.Objects;

public class Student extends Person {
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
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
    public boolean leavePetWith(Person otherPerson) {
        return super.leavePetWith(otherPerson);
    }

    @Override
    public boolean retrievePetFrom(Person otherPerson) {
        return super.retrievePetFrom(otherPerson);
    }


    @Override
    public String getOccupation() {
        return "Student";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(university, student.university);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + ", University: " + this.university;
    }
}