package com.lqc.dao;

import com.lqc.entity.Cart;
import com.lqc.entity.Product;

import java.util.List;

public interface CartDao {

    public void addProductToCart(Product product);
    public void updateCart();
    public List<Cart> viewCart();
}
