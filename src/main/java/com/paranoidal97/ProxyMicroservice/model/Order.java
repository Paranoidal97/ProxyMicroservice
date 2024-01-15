package com.paranoidal97.ProxyMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Order {
    private Long id;
    private String adress;
    private String delivery;
    private String payment;
    private ShoppingCart cart;
    private String status;
}
