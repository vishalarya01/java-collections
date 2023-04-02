package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();

        Book book1 = new Book("First book", "XYZ", 1999);
        Book book2 = new Book("Second book", "ABC", 1989);
        Book book3 = new Book("Third book", "MNC", 2003);

        books.add(book1);
        books.add(book2);
//        books.add(book3);

        books.add(1,book3);

        System.out.println("All Book");


        // traverse using for loop
        for(int i = 0; i<books.size(); i++){
            System.out.println(books.get(i));
        }

        Iterator<Book> iterator = books.iterator();


//        traverse using list iterator
        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }
    }




}
