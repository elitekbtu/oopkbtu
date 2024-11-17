package lab3.problem6;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String getOccupation() {
        return "Student";
    }
}