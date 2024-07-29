package com.example.springboot.service.oneToMany.unidirectional;

import com.example.springboot.entity.oneToMany.unidirectional.University;
import com.example.springboot.repository.oneToMany.unidirectional.UniversityRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityService {
    private final UniversityRepository universityRepository;

    UniversityService(UniversityRepository universityRepository) {
        this.universityRepository = universityRepository;
    }

    public Iterable<University> findAllUniversities() {
        return universityRepository.findAll();
    }
}
