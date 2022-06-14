package com.customerAndProductAPI.boot;

import com.customerAndProductAPI.boot.model.Book;
import com.customerAndProductAPI.boot.model.Student;
import com.customerAndProductAPI.boot.model.post;
import com.customerAndProductAPI.boot.model.tag;
import com.customerAndProductAPI.boot.repository.postRepo;
import com.customerAndProductAPI.boot.repository.studentRepo;
import com.customerAndProductAPI.boot.repository.tagRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.text.html.parser.Entity;
import java.sql.Array;
import java.util.*;

@SpringBootApplication
public class CustomerAndProductApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CustomerAndProductApiApplication.class, args);
        System.out.println("hello world");


        Map<String,Integer>numbermapping=new HashMap<>();
        numbermapping.put("one", 1);
        numbermapping.put("two", 2);
        numbermapping.put("three", 3);
        numbermapping.put("four", 4);
        numbermapping.put("five", 5);
        numbermapping.put("six", 6);
        System.out.println(numbermapping);
    }
    @Override
    public void run(String... args) throws Exception {
 /*
        post p1=new post("hibernate many to many mapping example with spring boot","hibernate many to many mapping example with spring boot","hibernate");

        tag t1=new tag("hibernate");
        tag t2=new tag("java");

        p1.getTags().add(t1);
        p1.getTags().add(t2);

        t1.getPosts().add(p1);
        t2.getPosts().add(p1);

        this.prepo.save(p1);

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
//        srepo.save(student1);

        List<Book> listbook2 = new ArrayList<>();
        Book book3 = new Book();
        book3.setBid(501);
        book3.setBname("aas");
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
//        srepo.save(stu2);

        Student stu3=new Student("ramesh", "ramesh@yahoo.com",listbook);
        Student stu4=new Student("chand","chand@mozila.com",listbook2);
        Student stu5=new Student("arora","arora@google.com",listbook);

        List<Student> listofstudent=new ArrayList<>();
        listofstudent.add(student1);
        listofstudent.add(stu2);
        listofstudent.add(stu3);
        listofstudent.add(stu4);
        listofstudent.add(stu5);

        srepo.saveAll(listofstudent);

        listofstudent.forEach((stu)->{
            String email=stu.getSemail();
            int agtindex=email.indexOf('@');
            System.out.println("student name as per email   :- "+email.substring(0,agtindex));
            System.out.println("student domain as per email :- "+email.substring(agtindex+1));
        });

*/
    }
}
