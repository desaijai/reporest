package com.customerAndProductAPI.boot.service;

import com.customerAndProductAPI.boot.Exception.resourceNotFound;
import com.customerAndProductAPI.boot.dto.studentDTO;
import com.customerAndProductAPI.boot.model.Student;
import com.customerAndProductAPI.boot.repository.bookRepo;
import com.customerAndProductAPI.boot.repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentServiceimpl implements studentService {

    @Autowired
    private bookRepo brepo;

    @Autowired
    private studentRepo srepo;

    @Override
    public Student createStudent(studentDTO student) {
        return srepo.save(student.getStudent());
    }

    @Override
    public List<Student> fetchStudent() {
        return srepo.findAll();
    }

    @Override
    public Student updateStudent(int sid, Student student) {
        Student oldData = srepo.findById(sid).orElseThrow(() -> new resourceNotFound("student", "sid", sid));
        oldData.setSname(student.getSname());
        oldData.setSemail(student.getSemail());
        oldData.setSbook(student.getSbook());
        return srepo.save(oldData);
    }

    @Override
    public Student getStudentById(int sid) {
        Student student = srepo.findById(sid).orElseThrow(() -> new resourceNotFound("student", "sid", sid));
        return srepo.save(student);
    }

    @Override
    public void deleteStudent(int sid) {
        Student student = srepo.findById(sid).orElseThrow(() -> new resourceNotFound("student", "sid", sid));
        srepo.delete(student);
    }

    @Override
    public List<Student> findBysname(String sname) {
        return srepo.findBysname(sname);
    }


}
