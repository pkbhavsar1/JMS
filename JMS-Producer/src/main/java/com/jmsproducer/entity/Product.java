package com.jmsproducer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private static final Long serialVersionUID= 1L;
    private int productId;
    private String name;
    private int quantity;
}
