package com.example.springboot.UserRelation.service.oneToMany.bidirectional;

import com.example.springboot.UserRelation.service.model.oneToMany.bidirectional.CartItemDTO;
import com.example.springboot.UserRelation.service.repository.oneToMany.bidirectional.CartRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    private final CartRepository cartRepository;
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public CartItemDTO findAllCarts() {
        CartItemDTO cartItemDTO = new CartItemDTO();
        cartItemDTO.setCarts(cartRepository.findAll());
        cartItemDTO.setMessage("Data fetched successfully");
        cartItemDTO.setStatus("200");
        return cartItemDTO;
    }

}
