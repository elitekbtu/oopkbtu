package practice2;

import java.util.Scanner;

public class Student {
    public static  void main(String []args){
        String Values[] = readInput();
        StudentData studentData = new StudentData<>(Values[0], Values[1], Values[2]);
        studentData.changeName("Danial");
        System.out.println(studentData.getID());
        studentData.changeYearOfStudy("2024");
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
class StudentData<NameType, IDType, YearOfStudyType> {
    private NameType name;
    private IDType id;
    private YearOfStudyType yearOfStudy;

    public StudentData(NameType name, IDType id, YearOfStudyType yearOfStudy) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = yearOfStudy;
    }

    public NameType getName() {
        return name;
    }

    public void changeName(NameType newName) {
        this.name = newName;
    }

    public IDType getID() {
        return id;
    }

    public void changeID(IDType newID) {
        this.id = newID;
    }

    public YearOfStudyType getYearOfStudy() {
        return yearOfStudy;
    }

    public void changeYearOfStudy(YearOfStudyType newYearOfStudy) {
        this.yearOfStudy = newYearOfStudy;
    }
}

