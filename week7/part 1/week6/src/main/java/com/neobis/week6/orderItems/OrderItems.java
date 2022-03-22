package com.neobis.week6.orderItems;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "order_items")
public class OrderItems {
    @Id
    @SequenceGenerator(
            name = "order_items_sequence",
            sequenceName = "order_items_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "order_items_sequence"
    )
    @Column(name = "order_item_id")
    private Long orderItemId;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "order_status_id")
    private Long orderStatusId;

    @Column(name = "ship_item_id")
    private Long shipItemId;

    @Column(name = "payment_item_id")
    private Long paymentItemId;
}
