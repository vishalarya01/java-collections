package collection;

import java.util.Comparator;

public class MyCustomComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        System.out.println("Comparator Compare() called");

        return o2.getPhysics() - o1.getPhysics();
    }
}
