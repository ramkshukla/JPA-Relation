package com.example.springboot.model.oneToMany.unidirectional;

import jakarta.persistence.*;

import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "University")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @OneToMany
    @JoinColumn(name = "university_id")
    private List<Student> students = new ArrayList<Student>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
