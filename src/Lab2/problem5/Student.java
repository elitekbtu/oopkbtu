package Lab2.problem5;

public class Student extends Person{
    private String university;

    Student(String name, int age, String university){
            super(name, age);
            this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
    public  void leavePet(Person adam){

    }

    @Override
    public boolean equals(Person adam) {
        if (super.equals(adam)) {
            if (adam instanceof Student) {
                Student s = (Student) adam;
                return this.university == s.university;
            }
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "university: " + university;
    }

    @Override
    public int hashCode() {
        String result = this.university;
        char [] hashcode = result.toCharArray();
        int sum = 0;
        for(int i=0; i<hashcode.length; i++){
            sum+=hashcode[i];
        }
        return super.hashCode() + sum;
    }
}
