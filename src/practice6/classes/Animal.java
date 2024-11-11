package practice6.classes;

public class Animal {
    private String name;
    private int age;
    public Animal(String name) {
        this.name = name;

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void breathe(){
        System.out.println(getName()+"is breathing");
    }
    public void move(){
        System.out.println(getName()+"is moving");
    }
    public void eat(){
        System.out.println(getName()+"is eating");
    }
}
