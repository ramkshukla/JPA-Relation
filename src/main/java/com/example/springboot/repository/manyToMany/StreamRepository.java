package com.example.springboot.repository.manyToMany;

import com.example.springboot.entity.manyToMany.Stream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends CrudRepository<Stream, Long> {
}
