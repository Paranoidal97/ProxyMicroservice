package com.paranoidal97.ProxyMicroservice.controller;

import com.paranoidal97.ProxyMicroservice.model.Product;
import com.paranoidal97.ProxyMicroservice.model.ShoppingCart;
import com.paranoidal97.ProxyMicroservice.service.GatewayService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class GatewayController {
    private final GatewayService service;

    // Products
    @GetMapping
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/type/{productType}")
    public List<Product> getProductByType(@PathVariable String productType){
        return service.getAllProductsByType(productType);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable String id){
        return service.getProductById(id);
    }

    @PostMapping("/addCartItem/{id}")
    public ShoppingCart addCartItem(@RequestBody Product product, @PathVariable Long id){
        return service.addCartItem(id,product);
    }

    @PostMapping("/addCartItem")
    public ShoppingCart addCartItem( @RequestBody Product product){
        return service.addCartItemWithoutId(product);
    }

    @GetMapping("/getShoppingCart/{id}")
    public ShoppingCart getShoppingCart(@PathVariable Long id){
        return service.getShoppingCart(id);
    }

}
