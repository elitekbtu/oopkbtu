package lab2.problem5;

public class PetManagmentTester {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Computer Science");
        Animal murka = new Cat("Murka", 5);
        Animal murkaaa = new Dog("Murkaaaa", 5);

        john.assignPet(murka);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);


        alice.assignPet(murkaaa);

        john.leavePetWith(alice);
        System.out.println(registry);

        john.retrievePetFrom(alice);
        System.out.println(registry);
    }
}