package com.paranoidal97.ProxyMicroservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.OffsetTime;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
public class ShoppingCart {
    private Long id;
    List<Product> products;
    private OffsetTime lastModified;
}
