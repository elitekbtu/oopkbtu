package practice3;

import java.util.Scanner;
import java.util.Vector;

public class PersonTester {
    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();
        Scanner sc = new Scanner(System.in);  // Scanner should not be repeatedly initialized or closed

        while (true) {
            System.out.println("Welcome to PersonTester class");
            System.out.println("Input the number of people:");
            int number = sc.nextInt();
            sc.nextLine();  // Consume the newline after integer input

            for (int i = 0; i < number; i++) {
                System.out.println("Write type of person: Person, Student, or Staff");
                String type = sc.nextLine();

                if (type.equals("Person")) {
                    System.out.println("Type as this: name address");
                    String[] personInfo = sc.nextLine().split(" ");
                    String name = personInfo[0];
                    String address = personInfo[1];
                    people.add(new Person(name, address));

                } else if (type.equals("Student")) {
                    System.out.println("Type as this: name address program year fee");
                    String[] studentInfo = sc.nextLine().split(" ");
                    String name = studentInfo[0];
                    String address = studentInfo[1];
                    String program = studentInfo[2];
                    int year = Integer.parseInt(studentInfo[3]);
                    double fee = Double.parseDouble(studentInfo[4]);
                    people.add(new Student(name, address, program, year, fee));

                } else if (type.equals("Staff")) {
                    System.out.println("Type as this: name address school pay");
                    String[] staffInfo = sc.nextLine().split(" ");
                    String name = staffInfo[0];
                    String address = staffInfo[1];
                    String school = staffInfo[2];
                    double pay = Double.parseDouble(staffInfo[3]);
                    people.add(new Staff(name, address, school, pay));
                }
            }

            for (Person p : people) {
                System.out.println("Name: " + p.getName());
                System.out.println("Address: " + p.getAddress());

                if (p instanceof Student) {
                    Student s = (Student) p;
                    System.out.println("Program: " + s.getProgram());
                    System.out.println("Year: " + s.getYear());
                    System.out.println("Fee: " + s.getFee());
                } else if (p instanceof Staff) {
                    Staff st = (Staff) p;
                    System.out.println("School: " + st.getSchool());
                    System.out.println("Pay: " + st.getPay());
                }

                System.out.println();
            }
            for (Person p : people) {
                if (p instanceof Student) {
                    Student s = (Student) p;
                    s.setAddress("Islam Karimova 70k1");
                    s.setProgram("Site");
                    s.setYear(s.getYear() + 1);
                } else if (p instanceof Staff) {
                    Staff st = (Staff) p;
                    st.setAddress("Turgut Ozala 80");
                    st.setSchool("Shpm");
                    st.setPay(st.getPay() + 5000.0);
                }
            }

            System.out.println("Updated details:");
            for (Person p : people) {
                System.out.println(p);
            }
            break;
        }
    }
}