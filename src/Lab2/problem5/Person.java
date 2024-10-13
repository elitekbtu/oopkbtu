package Lab2.problem5;

public abstract class Person{
    String name;
    int age;
    Animal pet = null;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void assignPet(Animal pet){
        this.pet = pet;
    }
    public void removePet(){
        this.pet = null;
    }
    public boolean hasPet(){
        if(pet != null){
            return false;
        }
        return true;
    }
    public String toString(){
        return this.name + " " + this.age + " " + this.pet.toString();
    }
    public boolean equals(Person adam){
        if (this.name != adam.name && this.age != adam.age && this.pet != adam.pet){
            return false;
        }
        return true;
    }
    public int hashCode(){
        int sum = 0;
        String toStr = toString();
        char[] hashArray = toStr.toCharArray();
        for(int i=0; i<hashArray.length; i++){
            sum+=hashArray[i];
        }
        return sum;
    }

}
