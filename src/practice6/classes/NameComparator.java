package practice6.classes;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

