package com.neobis.week6.productCategory;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_categories")
public class ProductCategory {
    @Id
    @SequenceGenerator(
            name = "product_categories_sequence",
            sequenceName = "product_categories_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_categories_sequence"
    )
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "name")
    private String name;

}
