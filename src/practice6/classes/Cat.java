package practice6.classes;

import practice6.interfaces.CanHavePizza;

import java.io.*;

public class Cat extends Animal implements CanHavePizza {
    File catImage = new File("src/practice6/img/mysyq.txt");

    public Cat(String name) {
        super(name);
    }

    public void eatPizza() {
        System.out.println(getName() + " eats a pizza: " + PizzaSize + " pieces");
    }

    public void printCatImage() {
        System.out.println("Hello, I am " + getName());
        try (BufferedReader reader = new BufferedReader(new FileReader(catImage))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void setCatImage(File catImage) {
        this.catImage = catImage;
    }

    public File getCatImage() {
        return catImage;
    }
}
