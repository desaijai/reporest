package com.customerAndProductAPI.boot;

import com.customerAndProductAPI.boot.model.Book;
import com.customerAndProductAPI.boot.model.Student;
import com.customerAndProductAPI.boot.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class CustomerAndProductApiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerAndProductApiApplication.class, args);
		System.out.println("hello world");
	}

	@Autowired
	studentRepo srepo;

	@Override
	public void run(String... args) throws Exception {

		List<Book> listbook=new ArrayList<>();

		Book book1=new Book();
		book1.setBid(12);
		book1.setBname("one reader");
		book1.setBauthor("abc");
		book1.setBprice(560.12);

		Book book2=new Book();
		book2.setBid(14);
		book2.setBname("pearson");
		book2.setBauthor("pears");
		book2.setBprice(420.52);

		listbook.add(book1);
		listbook.add(book2);
		Student student1=new Student("sams","sams@gmail.com",listbook);
		srepo.save(student1);

		List<Book> listbook2=new ArrayList<>();
		Book book3=new Book();
		book3.setBid(501);
		book3.setBname("harry porter");
		book3.setBauthor("milton k.");
		book3.setBprice(8500.50);

		Book book4=new Book();
		book4.setBid(1401);
		book4.setBname("mobs");
		book4.setBauthor("xyz");
		book4.setBprice(350.57);

		listbook2.add(book3);
		listbook2.add(book4);

		Student stu2=new Student("jay","jay@gmail.com",listbook2);
		srepo.save(stu2);
	}
}
