package Lab2.problem5;

public class PhDStudent extends Person{
    private String science;

    PhDStudent(String name, int age, String science){
        super(name, age);
        this.science = science;
    }

    public String getScience() {
        return science;
    }

    public void setScience(String science) {
        this.science = science;
    }

    @Override
    public String toString() {
        return super.toString() + "science: " + this.science;
    }

    @Override
    public boolean equals(Person adam) {
        if (super.equals(adam)) {
            if (adam instanceof PhDStudent) {
                PhDStudent phDStudent = (PhDStudent) adam;
                return this.science == phDStudent.science;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        String result = this.science;
        int sum = 0;
        char [] hashcode = result.toCharArray();
        for(int i=0; i<hashcode.length; i++){
            sum += hashcode[i];
        }
        return super.hashCode() + sum;
    }
}
