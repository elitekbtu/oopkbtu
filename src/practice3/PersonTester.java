package practice3;

import java.util.Vector;

public class PersonTester {
    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();

        Student student = new Student("Arman", "Tole bi 21", "FIT", 2023, 12000.0);
        Staff staff = new Staff("Alimzhan", "Abay 123", "Rim", 50000.0);
        Person person = new Person("Beknur", "Bolashak 34/7a");

        people.add(student);
        people.add(staff);
        people.add(person);

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
    }
}


