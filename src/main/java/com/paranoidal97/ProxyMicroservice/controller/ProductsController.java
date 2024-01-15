package com.paranoidal97.ProxyMicroservice.controller;

import com.paranoidal97.ProxyMicroservice.configuration.ProductsConfiguration;
import com.paranoidal97.ProxyMicroservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "products", url = "${app.products.api.url}",configuration = ProductsConfiguration.class)
public interface ProductsController {

    @GetMapping
    public List<Product> getAllProducts();

    @GetMapping("/type/{productType}")
    public List<Product> getAllProductByType(@PathVariable String productType);

    @GetMapping("/id/{id}")
    public Product getProductById(@PathVariable String id);

    @GetMapping("/{id}/{id}")
    public Product getProductWithVariant(@PathVariable String id, @PathVariable String variantId);
}
