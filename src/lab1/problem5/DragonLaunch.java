package lab1.problem5;

import lab1.Gender;

import java.util.Vector;

public class DragonLaunch {
    Vector<Person> students = new Vector<Person>();

    public DragonLaunch() {}

    public void kidnap(Person person) {
        this.students.add(person);
    }

    public boolean willDragonEatOrNot() {
        int numberOfFreeBoys = 0;
        for(Person i: students){
            if(i.gender==Gender.BOY){
                numberOfFreeBoys++;
            }
            else{
                numberOfFreeBoys--;
            }
        }
        if (numberOfFreeBoys==0){
            return false;
        }
        return true;
    }

}