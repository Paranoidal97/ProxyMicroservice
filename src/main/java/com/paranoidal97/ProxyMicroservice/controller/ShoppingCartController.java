package com.paranoidal97.ProxyMicroservice.controller;

import com.paranoidal97.ProxyMicroservice.configuration.ShoppingCartConfiguration;
import com.paranoidal97.ProxyMicroservice.model.Product;
import com.paranoidal97.ProxyMicroservice.model.ShoppingCart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "shoppingCart", url = "${app.shoppingCart.api.url}", configuration = ShoppingCartConfiguration.class)
public interface ShoppingCartController {
    @PostMapping
    public ShoppingCart createShoppingCart();

    @PatchMapping("/id}/addCartItem")
    public ShoppingCart addCartItem(@RequestBody Product product, @PathVariable Long id);

    @GetMapping("/{id}")
    public ShoppingCart getShoppingCart(@PathVariable Long id);
}
