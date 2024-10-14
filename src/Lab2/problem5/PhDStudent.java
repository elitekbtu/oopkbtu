package Lab2.problem5;

public class PhDStudent extends Person {
    private String science;

    public PhDStudent(String name, int age, String science) {
        super(name, age);
        this.science = science;
    }

    @Override
    public String getOccupation() {
        return "PhD Student";
    }

    @Override
    public String toString() {
        return super.toString() + ", Science: " + this.science;
    }
}