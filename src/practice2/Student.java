package practice2;

import java.util.Scanner;

public class Student {
    public static void main(String []args){
        String Values[] = readInput();
        StudentData studentData = new StudentData(Values[0], Integer.parseInt(Values[1]));
        studentData.changeName("Danial");
        System.out.println(studentData.getID());
        studentData.changeID(12345);
        System.out.println(studentData.getID());
        studentData.changeYearOfStudy();
        studentData.getYearOfStudy();
        System.out.println(studentData.getName());
        System.out.println(studentData.getYearOfStudy());
    }
    public static String[] readInput() {
        String inputValue;
        Scanner scanner = new Scanner(System.in);
        inputValue = scanner.nextLine();
        return inputValue.split(" ");
    }

}
class StudentData {
    private String name;
    private int id;
    private int yearOfStudy;

    public StudentData(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy++;
    }

    public String getName() {
        return name;
    }

    public void changeName(String newName) {
        this.name = newName;
    }

    public int getID() {
        return id;
    }

    public void changeID(int newID) {
        this.id = newID;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void changeYearOfStudy() {
        this.yearOfStudy++;
    }
}

