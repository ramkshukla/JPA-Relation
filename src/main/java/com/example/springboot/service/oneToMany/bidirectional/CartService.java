package com.example.springboot.service.oneToMany.bidirectional;

import com.example.springboot.entity.oneToMany.bidirectional.Cart;
import com.example.springboot.repository.oneToMany.bidirectional.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private final CartRepository cartRepository;
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public Iterable<Cart> findAllCarts() {
        return cartRepository.findAll();
    }
}
