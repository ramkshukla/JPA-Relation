package com.example.springboot.repository.manyToMany;

import com.example.springboot.entity.manyToMany.Viewer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer, Long> {
}
