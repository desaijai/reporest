package com.customerAndProductAPI.boot;

import com.customerAndProductAPI.boot.model.Book;
import com.customerAndProductAPI.boot.model.Student;
import com.customerAndProductAPI.boot.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.text.html.parser.Entity;
import java.sql.Array;
import java.util.*;

@SpringBootApplication
public class CustomerAndProductApiApplication implements CommandLineRunner {

    @Autowired
    studentRepo srepo;

    public static void main(String[] args) {
        SpringApplication.run(CustomerAndProductApiApplication.class, args);
        System.out.println("hello world");
    }

    @Override
    public void run(String... args) throws Exception {

        List<Book> listbook = new ArrayList<>();

        Book book1 = new Book();
        book1.setBid(12);
        book1.setBname("one reader");
        book1.setBauthor("abc");
        book1.setBprice(560.12);

        Book book2 = new Book();
        book2.setBid(14);
        book2.setBname("pearson");
        book2.setBauthor("pears");
        book2.setBprice(420.52);

        listbook.add(book1);
        listbook.add(book2);
        Student student1 = new Student("sams", "sams@gmail.com", listbook);
        srepo.save(student1);

        List<Book> listbook2 = new ArrayList<>();
        Book book3 = new Book();
        book3.setBid(501);
        book3.setBname("harry porter");
        book3.setBauthor("milton k.");
        book3.setBprice(8500.50);

        Book book4 = new Book();
        book4.setBid(1401);
        book4.setBname("mobs");
        book4.setBauthor("xyz");
        book4.setBprice(350.57);

        Book book5=new Book(201,"aas","hasl worl",901);
        listbook2.add(book3);
        listbook2.add(book4);
        listbook.add(book3);
        listbook.add(book4);
        listbook.add(book5);

        Student stu2 = new Student("jay", "jay@gmail.com", listbook2);
        srepo.save(stu2);
/*
        listbook.forEach((element) -> {
            System.out.println(element);
        });
        System.out.println("--------------------------------------------------");
        for (Iterator iterator = listbook2.iterator(); iterator.hasNext(); ) {
            Book book = (Book) iterator.next();
            System.out.println(book);
        }
        System.out.println("--------------------------------------------------");
        for(Book b:listbook2){
            System.out.println(b);
        }
        */
        System.out.println("--------------------------------------------------");
        listbook2.forEach(
                (Book) -> System.out.println(Book.getBname()
                        + "\n" + Book.getBauthor() + "\n" + Book.getBprice() + "\n-----------"
                ));

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);

        Collections.sort(list1);
        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);

        Collections.sort(listbook, (b1, b2) -> (int) (b2.getBprice() - b1.getBprice()));
        System.out.println("-----------------------------");
        System.out.println(listbook);

        System.out.println("-------------------------------");
        Collections.sort(listbook,(b1,b2)->(b1.getBname().compareTo(b2.getBname())));
        System.out.println(listbook);

        LinkedList<String> fruits=new LinkedList<>();
        fruits.add("mango");
        fruits.add("banana");

        fruits.add(1,"watermelon");
//        System.out.println(fruits); output :- [mango,watermelon,banana]
        fruits.addFirst("pineple");
//        System.out.println(fruits); output:-[pineple,mango,watermelon,banana]
        fruits.addLast("peri");
//        System.out.println(fruits); output:- [pineple,mango,watermelon,banana,peri]

        System.out.println(fruits.getFirst());
        System.out.println(fruits.getLast());
        System.out.println(fruits.get(2));

        for(String f:fruits){
            System.out.println(f);
        }

        String email="hello@gmail.com";
        int index=email.indexOf('@');
        System.out.println("Username :- "+email.substring(0, index));
        System.out.println("domain :- "+email.substring(index+1));
    }
}
