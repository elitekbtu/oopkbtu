package practice6.classes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        Cat cat = new Cat("Aqmoiyn");
        Person p1 = new Person("Ermek");
        Student s1 = new Student("Danial");
        Samsung phone = new Samsung("Samsung Galaxy S10", 250000);
        PowerSocket pw = new PowerSocket();
        App app = new App();
        MemoryGame mg = new MemoryGame();
        Logic_Game lg = new Logic_Game();

        Restaurant res = new Restaurant();
        res.servePizza(cat);
        res.servePizza(p1);
        res.servePizza(s1);

        System.out.println("\nStudent actions:");
        s1.breathe();
        s1.eat();
        s1.move();
        s1.dance();
        s1.canHaveRetake();
        s1.eatPizza();

        System.out.println("\nStudent wants to charge phone:");
        pw.charge(phone);

        System.out.println("\nSorting algorithm:");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Maxim"));
        students.add(new Student("Leonid"));
        students.add(new Student("Rayimbek"));
        students.add(new Student("JayZ"));

        System.out.println("List before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        Collections.sort(students, new NameComparator());

        System.out.println("\nList after sorting:");
        for (Student s : students) {
            System.out.println(s);
        }
        app.getStatistics(mg);
        app.getStatistics(lg);
    }
}

