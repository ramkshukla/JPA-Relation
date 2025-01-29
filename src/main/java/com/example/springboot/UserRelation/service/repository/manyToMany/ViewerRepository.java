package com.example.springboot.UserRelation.service.repository.manyToMany;

import com.example.springboot.UserRelation.service.entity.manyToMany.Viewer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer, Long> {
}
