package practice6.classes;

import practice6.interfaces.CanHavePizza;

public class Resturant {
    public boolean servePizza(CanHavePizza eater){
        eater.eatPizza();
        if(eater instanceof Person){
            processPayment((Person) eater);
            return true;
        }
        return false;
    }
    private void processPayment(Person person){
        System.out.println("This person will pay: "+person.getName());
    }

}
