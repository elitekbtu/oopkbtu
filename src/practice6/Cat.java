package practice6;

import practice6.interfaces.Breathe;
import practice6.interfaces.Eating;
import practice6.interfaces.Move;

public class Cat implements Breathe, Move, Eating {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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