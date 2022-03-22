package com.neobis.week6.textile;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "textile")
public class Textile {
    @Id
    @SequenceGenerator(
            name = "textile_sequence",
            sequenceName = "textile_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "textile_sequence"
    )
    @Column(name = "textile_id")
    private Long textileId;

    @Column(name = "color_id")
    private String colorId;

    @Column(name = "price")
    private Double price;

    @Column(name = "footage")
    private Double footage;

    @Column(name = "seller_id")
    private String sellerId;
}
