package com.example.springboot.repository.oneToMany.bidirectional;

import com.example.springboot.entity.oneToMany.bidirectional.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
}
