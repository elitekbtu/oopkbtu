package practice6.classes;

import practice6.interfaces.CanHavePizza;

import java.io.File;

public class Cat extends Animal implements CanHavePizza {
    File catImage = new File("src/practice6/img/mysyq.txt");
    public Cat(String name) {
        super(name);
    }
    public void eatPizza() {
        System.out.println(getName()+" eats a pizza: "+ PizzaSize+" pieces");
    }
}
