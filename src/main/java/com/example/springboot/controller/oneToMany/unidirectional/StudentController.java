package com.example.springboot.controller.oneToMany.unidirectional;


import com.example.springboot.entity.oneToMany.unidirectional.Student;
import com.example.springboot.service.oneToMany.unidirectional.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
    private final StudentService studentService;
    StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public Iterable<Student> getStudents() {
        return studentService.getAllStudents();
    }
}
