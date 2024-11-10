package practice6.podtask;

import practice6.interfaces.Breathe;
import practice6.interfaces.CanHavePizza;
import practice6.interfaces.Eating;
import practice6.interfaces.Move;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Person implements Breathe, Move, Eating, CanHavePizza {
    private String name;
    private int age;
    private int balance;
    private File personImage = new File("src/practice6/img/adamlike.txt");

    public Person(String name, int age, int balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
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

    public void printPersonImage() {
        try (BufferedReader reader = new BufferedReader(new FileReader(personImage))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

    }

    public void eatPizza(){

    };

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public boolean extractBalance(int pay){
        if(this.balance-pay<0){
            System.out.println(this.name+ " you are don't have money please pol zhu");
            return false;
        }
        else{
            System.out.println(this.name + " you are have money, please enjoy");
            this.balance = this.balance - pay;
            return true;
        }
    }

    @Override
    public void moving() {
        System.out.println("Person is moving");
    }

    @Override
    public void breathe() {
        System.out.println("Person is breathing");
    }

    @Override
    public void eating() {
        System.out.println("Person is eating");
    }
}
