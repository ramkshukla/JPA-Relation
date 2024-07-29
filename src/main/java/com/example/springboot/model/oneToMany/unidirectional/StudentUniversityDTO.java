package com.example.springboot.model.oneToMany.unidirectional;


import com.example.springboot.entity.oneToMany.unidirectional.Student;
import com.example.springboot.entity.oneToMany.unidirectional.University;
import com.example.springboot.entity.oneToOne.bidirectional.Owner;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StudentUniversityDTO {
    private String status;
    private String message;
    private Iterable<Student> students;
    private Iterable<University> university;

    public StudentUniversityDTO(String status, String message, Iterable<Student> students, Iterable<University> owners){
        this.status = status;
        this.message = message;
        this.students = students;
        this.university = university;
    }
    public StudentUniversityDTO() {}


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Iterable<Student> getStudents() {
        return students;
    }

    public void setStudents(Iterable<Student> students) {
        this.students = students;
    }

    public Iterable<University> getOwners() {
        return university;
    }

    public void setUniversity(Iterable<University> university) {
        this.university = university;
    }
}
