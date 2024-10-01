package practice3;

public class Animal {
    private String gender;
    private int age;

    Animal(){
    }
    Animal(String gender, int age) {
        this.gender = gender;
        this.age = age;
    }


    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String toString() {
        return this.gender + " " + this.age;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
}




