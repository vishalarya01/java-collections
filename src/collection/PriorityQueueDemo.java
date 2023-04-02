package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueDemo  {

    public static void main(String[] args) {



        List<Student> list = new ArrayList<>();
        list.add(new Student(23,45,76));
        list.add(new Student(32,12,90));
        list.add(new Student(12,45,21));
        list.add(new Student(90,56,13));
        list.add(new Student(78,78,89));

//        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(list);

//        if comparator is passed then comparator's compare() is executed
//                      Not Passed: class implements comparable
//                                                              Yes: CompareTo() method calles
//                                                              No: ClassCastException

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(new MyCustomComparator());


        for (Student student: list){
            priorityQueue.add(student);
        }
        List<Student> top3 = new ArrayList<>();
        //  top 3 students in maths
        int count = 0;
        while (!priorityQueue.isEmpty()){
            if(count == 3)
                break;
            count++;
            top3.add(priorityQueue.poll());
        }


        System.out.println(top3);

    }
}
