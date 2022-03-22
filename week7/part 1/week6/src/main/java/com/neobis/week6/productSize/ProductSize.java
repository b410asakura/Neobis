package com.neobis.week6.productSize;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "product_sizes")
public class ProductSize {
    @Id
    @SequenceGenerator(
            name = "product_sizes_sequence",
            sequenceName = "product_sizes_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sizes_sequence"
    )
    @Column(name = "size_id")
    private Long sizeId;

    @Column(name = "name")
    private String name;
}
