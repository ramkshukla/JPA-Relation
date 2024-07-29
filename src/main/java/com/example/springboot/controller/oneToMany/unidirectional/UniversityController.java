package com.example.springboot.controller.oneToMany.unidirectional;

import com.example.springboot.entity.oneToMany.unidirectional.University;
import com.example.springboot.model.oneToMany.unidirectional.StudentUniversityDTO;
import com.example.springboot.service.oneToMany.unidirectional.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/university")
public class UniversityController {
    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping
    public StudentUniversityDTO getUniversities() {
        return universityService.findAllUniversities();
    }
}
