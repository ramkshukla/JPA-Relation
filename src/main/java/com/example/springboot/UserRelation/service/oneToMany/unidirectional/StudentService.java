package com.example.springboot.UserRelation.service.oneToMany.unidirectional;

import com.example.springboot.UserRelation.service.model.oneToMany.unidirectional.StudentUniversityDTO;
import com.example.springboot.UserRelation.service.repository.oneToMany.unidirectional.StudentRepository;
import org.springframework.stereotype.Service;

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
