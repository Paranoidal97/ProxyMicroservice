package com.paranoidal97.ProxyMicroservice.service;

import com.paranoidal97.ProxyMicroservice.controller.OrdersController;
import com.paranoidal97.ProxyMicroservice.controller.ProductsController;
import com.paranoidal97.ProxyMicroservice.controller.ShoppingCartController;
import com.paranoidal97.ProxyMicroservice.model.Product;
import com.paranoidal97.ProxyMicroservice.model.ShoppingCart;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GatewayService {
    private final OrdersController ordersController;
    private final ProductsController productsController;
    private final ShoppingCartController shoppingCartController;

    public List<Product> getAllProducts() {
        return productsController.getAllProducts();
    }

    public List<Product> getAllProductsByType(String productType) {
        return productsController.getAllProductByType(productType);
    }

    public Product getProductById(String id) {
        return productsController.getProductById(id);
    }

    public ShoppingCart getShoppingCart(Long id) {
        return shoppingCartController.getShoppingCart(id);
    }

    public ShoppingCart addCartItem(Long id, Product product) {
        return shoppingCartController.addCartItem(product, id);
    }

    public ShoppingCart addCartItemWithoutId(Product product){
        ShoppingCart shoppingCart = shoppingCartController.createShoppingCart();
        Long id = shoppingCart.getId();
        return shoppingCartController.addCartItem(product,id);
    }


}
