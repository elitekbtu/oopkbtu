package Lab2.problem5;

public class Employee extends Person{
    private String job;
    Employee(String name, int age, String job){
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return super.toString() + "job: " + this.job;
    }

    @Override
    public boolean equals(Person adam) {
        if (super.equals(adam)) {
            if (adam instanceof Employee) {
                Employee employee = (Employee) adam;
                return this.job == employee.job;
            }
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        String result = this.job;
        char [] hashcode = result.toCharArray();
        int sum = 0;
        for(int i=0; i<hashcode.length; i++){
            sum+=hashcode[i];
        }
        return super.hashCode() + sum;
    }
}
