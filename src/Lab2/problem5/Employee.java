package Lab2.problem5;

import java.util.Objects;

public class Employee extends Person {
    private String job;

    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
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
        return "Employee";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(job, employee.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), job);
    }

    @Override
    public String toString() {
        return super.toString() + ", Job: " + this.job;
    }
}