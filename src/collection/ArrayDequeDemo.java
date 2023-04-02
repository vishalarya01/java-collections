package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {

    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // treat as FIFO
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerFirst(3);

        // treat as LIFO
        deque.offerLast(4);
        deque.offerLast(5);
        deque.offerLast(6);


        System.out.println(deque);



    }
}
