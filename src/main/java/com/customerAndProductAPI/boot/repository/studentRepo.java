package com.customerAndProductAPI.boot.repository;

import com.customerAndProductAPI.boot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface studentRepo extends JpaRepository<Student,Integer> {

    List<Student> findBysname(String sname);

}
