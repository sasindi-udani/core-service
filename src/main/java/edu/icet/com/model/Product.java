package edu.icet.com.model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private String name;
    private Double price;
    private String description;
}
