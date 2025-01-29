package com.example.springboot.UserRelation.service.controller.oneToMany.bidirectional;


import com.example.springboot.UserRelation.service.model.oneToMany.bidirectional.CartItemDTO;
import com.example.springboot.UserRelation.service.oneToMany.bidirectional.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cart")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping
    public CartItemDTO getCart() {
        return cartService.findAllCarts();
    }
}
