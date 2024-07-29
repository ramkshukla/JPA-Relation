package com.example.springboot.repository.oneToMany.unidirectional;

import com.example.springboot.entity.oneToMany.unidirectional.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University, Long> {
}
