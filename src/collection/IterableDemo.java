package collection;

import java.util.Iterator;
import java.util.Objects;

public class IterableDemo {

    public static void main(String[] args) {

        MyGenericList<Integer> list = new MyGenericList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object x: list)
            System.out.println(x);

    }
}
