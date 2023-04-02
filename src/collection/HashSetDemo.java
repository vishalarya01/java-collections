package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(40);

        set.add(20);
        set.add(20);
        set.add(30);

        // order not maintain
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>();

        set1.add(20);
        set1.add(20);
        set1.add(30);
        set1.add(10);
        set1.add(4);

        System.out.println(set1.contains(30));



    }
}
