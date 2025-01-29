package com.example.springboot.UserRelation.service.repository.oneToMany.bidirectional;

import com.example.springboot.UserRelation.service.entity.oneToMany.bidirectional.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
