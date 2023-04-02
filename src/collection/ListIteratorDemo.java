package collection;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        ListIterator<Integer> iterator = linkedList.listIterator();
// first increase the index and then return
        System.out.println(iterator.next());
        System.out.println(iterator.next());
// first decrement the index and then return
        System.out.println(iterator.previous());


        Integer [] arr = linkedList.toArray(new Integer[0]);

        for (int x: arr)
            System.out.println(x);



    }
}
