package practice6.classes;

import practice6.interfaces.CanHavePizza;

public class Cat extends Animal implements CanHavePizza {
    public Cat(String name) {
        super(name);
    }
    public void eatPizza() {
        System.out.println(getName()+" eats a pizza: "+ PizzaSize+" pieces");
    }
}
