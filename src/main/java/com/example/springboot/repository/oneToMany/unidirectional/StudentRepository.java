package com.example.springboot.repository.oneToMany.unidirectional;

import com.example.springboot.entity.oneToMany.unidirectional.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
}
