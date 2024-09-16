package drafts;

public class Program{

    public static void main(String[] args) {

        Person1 bob = new Person1();      // вызов первого конструктора без параметров
        bob.displayInfo();

        Person1 tom = new Person1("Tom"); // вызов второго конструктора с одним параметром
        tom.displayInfo();

        Person1 sam = new Person1("Sam", 25); // вызов третьего конструктора с двумя параметрами
        sam.displayInfo();
    }
}
class Person1{

    String name;    // имя
    int age;        // возраст
    Person1()
    {
        name = "Undefined";
        age = 18;
    }
    Person1(String n)
    {
        name = n;
        age = 18;
    }
    Person1(String n, int a)
    {
        name = n;
        age = a;
    }
    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
