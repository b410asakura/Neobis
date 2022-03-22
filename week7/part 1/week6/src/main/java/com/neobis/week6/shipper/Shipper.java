package com.neobis.week6.shipper;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shippers")
public class Shipper {
    @Id
    @SequenceGenerator(
            name = "shippers_sequence",
            sequenceName = "shippers_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "shippers_sequence"
    )
    @Column(name = "shipper_id")
    private Long shipperId;

    @Column(name = "name")
    private String name;
}
