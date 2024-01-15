package com.paranoidal97.ProxyMicroservice.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {
    private String id;
    private String name;
    private BigDecimal price;
    private String type;
    private String processor;
    private int ram;
    private String color;
    private int batteryCapacity;
    private String accesories;
}
