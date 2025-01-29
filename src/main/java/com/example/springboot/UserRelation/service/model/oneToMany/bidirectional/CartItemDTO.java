package com.example.springboot.UserRelation.service.model.oneToMany.bidirectional;

import com.example.springboot.UserRelation.service.entity.oneToMany.bidirectional.Cart;
import com.example.springboot.UserRelation.service.entity.oneToMany.bidirectional.Item;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartItemDTO{
    private String status;
    private String message;
    private Iterable<Cart> carts;
    private Iterable<Item> items;

    public CartItemDTO() {}

    public CartItemDTO(String status, String message, Iterable<Cart> carts, Iterable<Item> items) {
        this.status = status;
        this.message = message;
        this.carts = carts;
        this.items = items;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Iterable<Cart> getCarts() {
        return carts;
    }

    public void setCarts(Iterable<Cart> carts) {
        this.carts = carts;
    }

    public Iterable<Item> getItems() {
        return items;
    }

    public void setItems(Iterable<Item> items) {
        this.items = items;
    }
}
