package Lab2.problem5;

public class Student extends Person {
    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public String getOccupation() {
        return "Student";
    }

    @Override
    public String toString() {
        return super.toString() + ", University: " + this.university;
    }
}