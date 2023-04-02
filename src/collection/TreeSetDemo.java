package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {


        Set<Student> set = new TreeSet<>();


        Set<Student> set1 = new TreeSet<>((s1,s2) -> s2.getPhysics() - s1.getPhysics());
        set.add(new Student(23,45,76));
        set.add(new Student(32,12,90));
        set.add(new Student(12,45,21));
        set.add(new Student(90,56,13));
        set.add(new Student(78,78,89));

        for (Student student: set){
            System.out.println(student);

        }
        List<Student> slist = new ArrayList<>();
        slist.add(new Student(23,45,76));
        slist.add(new Student(32,12,90));
        slist.add(new Student(12,45,21));
        slist.add(new Student(90,56,13));
        slist.add(new Student(78,78,89));

        for (Student student: slist){
            set1.add(student);
        }

        // will use comparator

        for (Student student: set1)
            System.out.print(student);


    }
}
