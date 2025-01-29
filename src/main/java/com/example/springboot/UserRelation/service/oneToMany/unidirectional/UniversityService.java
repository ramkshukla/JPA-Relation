package com.example.springboot.UserRelation.service.oneToMany.unidirectional;

import com.example.springboot.UserRelation.service.model.oneToMany.unidirectional.StudentUniversityDTO;
import com.example.springboot.UserRelation.service.repository.oneToMany.unidirectional.UniversityRepository;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
    private final UniversityRepository universityRepository;

    UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public StudentUniversityDTO findAllUniversities() {
        StudentUniversityDTO studentUniversityDTO = new StudentUniversityDTO();
        studentUniversityDTO.setUniversity(universityRepository.findAll());
        studentUniversityDTO.setStatus("Data fetched successfully");
        studentUniversityDTO.setMessage("200");
        return studentUniversityDTO;
    }
}
