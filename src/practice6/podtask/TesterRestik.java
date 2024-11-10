package practice6.podtask;

import practice6.interfaces.CanHavePizza;

public class TesterRestik {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();
        CanHavePizza canHavePizza = new Cat("Murka", 18, 1000);
        CanHavePizza canHavePizza1 = new Person("Turarbek", 15, 0);
        delpapa.servePizza(canHavePizza);
        delpapa.servePizza(canHavePizza1);
    }
}
