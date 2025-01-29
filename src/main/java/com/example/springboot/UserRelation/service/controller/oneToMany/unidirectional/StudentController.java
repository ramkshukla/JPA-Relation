package com.example.springboot.UserRelation.service.controller.oneToMany.unidirectional;


import com.example.springboot.UserRelation.service.model.oneToMany.unidirectional.StudentUniversityDTO;
import com.example.springboot.UserRelation.service.oneToMany.unidirectional.StudentService;
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
    public StudentUniversityDTO getStudents() {
        return studentService.getAllStudents();
    }
}
