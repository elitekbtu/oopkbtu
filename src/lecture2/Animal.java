package lecture2;

public class Animal {
    public static String name;
    public static int age;
    public String gender;
    public int id;

    public Animal(String newName, int newAge, String newGender, int newId){
        this.name = newName;
        this.age = newAge;
        this.gender = newGender;
        this.id = newId;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
