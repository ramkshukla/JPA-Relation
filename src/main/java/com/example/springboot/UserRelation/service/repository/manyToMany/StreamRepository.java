package com.example.springboot.UserRelation.service.repository.manyToMany;

import com.example.springboot.UserRelation.service.entity.manyToMany.Stream;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends CrudRepository<Stream, Long> {
}
