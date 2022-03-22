package com.neobis.week6.product;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {
    @Id
    @SequenceGenerator(
            name = "products_sequence",
            sequenceName = "products_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "products_sequence"
    )
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "name")
    private String name;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "size_id")
    private Long sizeId;

    @Column(name = "price")
    private Double price;

    @Column(name = "textile_id")
    private Long textileId;

    @Column(name = "quantity_in_stock")
    private Integer quantityInStock;

}
