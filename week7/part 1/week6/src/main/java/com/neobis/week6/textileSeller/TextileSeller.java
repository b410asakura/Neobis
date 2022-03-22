package com.neobis.week6.textileSeller;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "textile_sellers")
public class TextileSeller {
    @Id
    @SequenceGenerator(
            name = "textile_sellers_sequence",
            sequenceName = "textile_sellers_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "textile_sellers_sequence"
    )
    @Column(name = "seller_id")
    private Long sellerId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;
}
