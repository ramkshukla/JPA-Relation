package com.example.springboot.repository.oneToMany.bidirectional;

import com.example.springboot.entity.oneToMany.bidirectional.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
