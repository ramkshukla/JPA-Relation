package com.example.springboot.service.oneToMany.unidirectional;

import com.example.springboot.entity.oneToMany.unidirectional.Student;
import com.example.springboot.model.oneToMany.unidirectional.StudentUniversityDTO;
import com.example.springboot.repository.oneToMany.unidirectional.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentUniversityDTO getAllStudents() {
        StudentUniversityDTO studentUniversityDTO = new StudentUniversityDTO();
        studentUniversityDTO.setStudents(studentRepository.findAll());
        studentUniversityDTO.setMessage("Data fetched successfully");
        studentUniversityDTO.setStatus("200");
        return studentUniversityDTO;
    }
}
