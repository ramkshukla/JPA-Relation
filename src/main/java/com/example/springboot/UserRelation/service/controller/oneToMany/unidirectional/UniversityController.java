package com.example.springboot.UserRelation.service.controller.oneToMany.unidirectional;

import com.example.springboot.UserRelation.service.model.oneToMany.unidirectional.StudentUniversityDTO;
import com.example.springboot.UserRelation.service.oneToMany.unidirectional.UniversityService;
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
