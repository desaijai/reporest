package com.customerAndProductAPI.boot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sid;
    private String sname;
    private String semail;

    @OneToMany(targetEntity = Book.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "Stu_id",referencedColumnName = "sid")
    private List<Book> sbook;

    public Student(String sname, String semail, List<Book> sbook) {
        this.sname = sname;
        this.semail = semail;
        this.sbook = sbook;
    }
}
