package com.paranoidal97.ProxyMicroservice.controller;

import com.paranoidal97.ProxyMicroservice.configuration.OrdersConfiguration;
import com.paranoidal97.ProxyMicroservice.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "orders", url = "${app.orders.api.url}", configuration = OrdersConfiguration.class)
public interface OrdersController {

    @PostMapping
    public Order createOrder(Order order);

    @GetMapping
    public List<Order> getAllOrders();

    @GetMapping("/id/{id}")
    public Order getOrderById(@PathVariable Long id);

    @GetMapping("/user/{id}")
    public List<Order> getAllOrdersByUser(@PathVariable Long id);
}
