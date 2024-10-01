package practice3;

public class Dog extends Animal {
    private String name;
    private String breed;
    Dog(){
        super();
    }
    Dog(String name, String breed){
        super();
        this.name = name;
        this.breed = breed;
    }
    Dog(String gender, int age){
        super(gender, age);
    }
    Dog(String gender, int age, String name, String breed) {
        super(gender, age);
        this.name = name;
        this.breed = breed;
    }

    public void setGender(String gender) {
        if(gender.equals("")){
            throw new IllegalArgumentException("Gender cannot be an empty string");
        }
        else{
            super.setGender(gender);
        }
    }
    public void setAge(int age) {
        if(age<0){
            System.out.println("You can't set value lower than 0");
        }
        else{
            super.setAge(age);
        }
    }
    public String toString() {
        return "Gender: " + super.getGender() + ", Age: " + super.getAge() + ", Name: "
                + this.name + ", Breed: " + this.breed;
    }
    public int getAge(){
        return super.getAge();
    }
    public String getGender(){
        return super.getGender();
    }

    public void setName(String name){
        if(name.equals("")){
            System.out.println("You can't give empty string");
        }
        else{
            this.name = name;
        }
    }
    public void setBreed(String breed){
        if(breed.equals("")){
            System.out.println("You can't give empty string");
        }
        else {
            this.breed = breed;
        }
    }
    public String getName(){
        return name;
    }
    public  String getBreed(){
        return breed;
    }
}
