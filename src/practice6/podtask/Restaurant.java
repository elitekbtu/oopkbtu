package  practice6.podtask;

import practice6.interfaces.CanHavePizza;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Restaurant {
    private File staffImage = new File("src/practice6/img/adamdar.txt");

    boolean servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person){
            Person person = (Person) eater;
            if(person.extractBalance(100)){
                System.out.println("Success!");
                person.printPersonImage();
                return true;
            }
            else{
                System.out.println("Failed!");
                return false;
            }
        }
        else if(eater instanceof Cat){
            Cat cat = (Cat) eater;
            if(cat.extractBalance(100)){
                System.out.println("Success!");
                cat.catPersonImage();
                return true;
            }
            else{
                System.out.println("Failed!");
                return false;
            }
        }
        return false;
    }

    public void getStaffImage() {
        try (BufferedReader reader = new BufferedReader(new FileReader(staffImage))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}