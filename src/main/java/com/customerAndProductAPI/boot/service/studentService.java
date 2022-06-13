package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.dto.studentDTO;
import com.customerAndProductAPI.boot.model.Student;

import java.util.List;

public interface studentService {

    public Student createStudent(studentDTO student);

    public List<Student> fetchStudent();

    public Student updateStudent(int sid,Student student);

    public Student getStudentById(int sid);

    public void deleteStudent(int sid);

}
