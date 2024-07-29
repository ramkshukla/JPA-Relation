package com.example.springboot.controller.oneToMany.bidirectional;


import com.example.springboot.entity.oneToMany.bidirectional.Cart;
import com.example.springboot.service.oneToMany.bidirectional.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public Iterable<Cart> getCart() {
        return cartService.findAllCarts();
    }
}
