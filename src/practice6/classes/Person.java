package practice6.classes;

import practice6.interfaces.CanHavePizza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Person  implements CanHavePizza {
    private String name;
    private int age;
    private File personImage = new File("src/practice6/img/adamlike.txt");
    public Person(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public File getPersonImage() {
        return personImage;
    }

    public void setPersonImage(File personImage) {
        this.personImage = personImage;
    }
    public void printPersonImage(){
        try(BufferedReader reader = new BufferedReader(new FileReader(personImage))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public void move(){
        System.out.println(getName()+" is moving");

    }
    public void eat(){
        System.out.println(getName()+ " is eating");
    }
    public void breathe(){
        System.out.println(getName()+" is breathing");
    }
    public void eatPizza() {
        System.out.println(getName()+ " eats a pizza: "+ PizzaSize+ " pieces");
    }
}
