package com.neobis.week6.orderStatuses;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_statuses")
public class OrderStatus {
    @Id
    @SequenceGenerator(
            name = "order_statuses_sequence",
            sequenceName= "order_statuses_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_statuses_sequence"
    )
    @Column(name = "order_status_id")
    private Long orderStatusId;

    @Column(name = "name")
    private String name;
}

