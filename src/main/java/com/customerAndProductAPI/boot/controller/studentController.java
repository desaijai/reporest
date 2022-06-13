package com.customerAndProductAPI.boot.controller;


import com.customerAndProductAPI.boot.dto.orderRequest;
import com.customerAndProductAPI.boot.dto.studentDTO;
import com.customerAndProductAPI.boot.model.Customer;
import com.customerAndProductAPI.boot.model.Student;
import com.customerAndProductAPI.boot.service.studentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class studentController {

    private studentService sservice;

    public studentController(studentService sservice) {
        this.sservice = sservice;
    }

    @GetMapping(produces = {"application/json"})
    public List<Student> getAllStudent() {
        return sservice.fetchStudent();
    }

    @PostMapping(consumes = {"application/json"})
    public ResponseEntity<Student> createStudent(@RequestBody studentDTO student) {
        return new ResponseEntity<>(sservice.createStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("{sid}")
    public ResponseEntity<Student> updateStudent(@PathVariable("sid") int sid, @RequestBody studentDTO student) {
        return new ResponseEntity<>(sservice.updateStudent(sid, student.getStudent()), HttpStatus.OK);
    }

    @GetMapping(value = "{sid}", produces = {"application/json"})
    public ResponseEntity<Student> getStudentById(@PathVariable("sid") int sid) {
        return new ResponseEntity<>(sservice.getStudentById(sid), HttpStatus.OK);
    }

    @DeleteMapping("{sid}")
    public ResponseEntity<String> deleteStudent(@PathVariable("sid") int sid) {
        sservice.deleteStudent(sid);
        return new ResponseEntity<>("Item Deleted Successfully", HttpStatus.OK);
    }

    @GetMapping(value = "find/{sname}",produces = {"application/json"})
    public List<Student> findbyStudentName(@PathVariable("sname") String sname){
        return sservice.findBysname(sname);
    }
}
