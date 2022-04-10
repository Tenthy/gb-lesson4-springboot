package ru.kmetha.springbootapril.model;

import lombok.*;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    private Integer id;
    private String title;
    private Double price;
}
