package Lab2.problem5;

public class Employee extends Person {
    private String job;

    public Employee(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    @Override
    public String getOccupation() {
        return "Employee";
    }

    @Override
    public String toString() {
        return super.toString() + ", Job: " + this.job;
    }
}