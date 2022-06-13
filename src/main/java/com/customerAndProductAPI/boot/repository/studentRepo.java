package com.customerAndProductAPI.boot.repository;

import com.customerAndProductAPI.boot.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface studentRepo extends JpaRepository<Student,Integer> {
}
