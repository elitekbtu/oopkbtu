package practice6.classes;

import practice6.interfaces.CanHavePizza;

public class Person  implements CanHavePizza {
    private String name;
    private int age;
    public Person(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
        System.out.println(getName()+ " eats a pizza: "+ PizzaSize+" pieces");
    }
}
