package lab2.problem5;

public abstract class Person {
    private String name;
    private int age;
    protected Animal pet = null;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public abstract String getOccupation();

    public boolean leavePetWith(Person otherPerson) {
        if (this.pet == null) {
            System.out.println(this.name + " does not have a pet to leave.");
            return false;
        }
        if (otherPerson instanceof PhDStudent && this.pet instanceof Dog) {
            System.out.println("PhD students cannot take care of dogs.");
            return false;
        }
        otherPerson.assignPet(this.pet);
        this.removePet();
        System.out.println(this.name + " has left their pet with " + otherPerson.getName());
        return true;
    }

    public boolean retrievePetFrom(Person otherPerson) {
        if (!otherPerson.hasPet()) {
            System.out.println(otherPerson.getName() + " does not have your pet.");
            return false;
        }
        this.assignPet(otherPerson.pet);
        otherPerson.removePet();
        System.out.println(this.name + " has retrieved their pet from " + otherPerson.getName());
        return true;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Age: " + this.age + ", Pet: " + (this.pet != null ? this.pet.getName() : "No pet");
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + (pet != null ? pet.hashCode() : 0);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age && this.pet == other.pet;
    }
}