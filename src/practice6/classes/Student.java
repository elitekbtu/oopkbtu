package practice6.classes;

import practice6.interfaces.CanHaveParty;
import practice6.interfaces.CanHavePizza;
import practice6.interfaces.CanHaveRetake;
import practice6.interfaces.Movable;

import java.util.Objects;

public class Student extends Person implements CanHavePizza, CanHaveRetake, CanHaveParty, Movable, Comparable<Student> {
    private double gpa;

    public Student(String name) {
        super(name);
        this.gpa = 0.0;
    }

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }


    @Override
    public void eatPizza() {
        System.out.println(getName() + " is eating pizza.");
    }

    @Override
    public void canHaveRetake() {
        System.out.println(getName() + " is retaking the exam.");
    }

    @Override
    public void dance() {
        System.out.println(getName() + " is dancing.");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving.");
    }


    public double getGpa() {
        return gpa;
    }


    @Override
    public String toString() {
        return "Student{name='" + getName() + "', gpa=" + gpa + "}";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return Double.compare(student.gpa, gpa) == 0 &&
                getName().equals(student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), gpa);
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa);
    }
}
