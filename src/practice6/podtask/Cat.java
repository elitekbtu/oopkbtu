package practice6.podtask;
import practice6.interfaces.Breathe;
import practice6.interfaces.CanHavePizza;
import practice6.interfaces.Eating;
import practice6.interfaces.Move;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cat implements Breathe, Move, Eating, CanHavePizza {
    private String name;
    private int age;
    private int korm;
    private File catImage = new File("src/practice6/img/mysyq.txt");

    public Cat(String name, int age, int korm) {
        this.name = name;
        this.age = age;
        this.korm = korm;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getKorm() {
        return korm;
    }

    public void setKorm(int korm) {
        this.korm = korm;
    }

    @Override
    public void eatPizza() {

    }

    public boolean extractBalance(int pay){
        if(korm<=0){
            System.out.println(this.name+ " you are don't have korm please take pizza!");
            korm = 100;
            return true;
        }
        else{
            System.out.println(this.name + " you are have korm, finish korm please!");
            this.korm = 0;
            return true;
        }
    }
    public void catPersonImage() {
        try (BufferedReader reader = new BufferedReader(new FileReader(catImage))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

    }

    @Override
    public void breathe() {
        System.out.println("Cat breath");
    }

    @Override
    public void moving() {
        System.out.println("Cat moving");
    }

    @Override
    public void eating() {
        System.out.println("Cat eating");
    }
}