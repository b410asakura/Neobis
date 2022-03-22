package com.neobis.week6.paymentItems;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "payment_items")
public class PaymentItems {
    @Id
    @SequenceGenerator(
            name = "payment_items_sequence",
            sequenceName = "payment_items_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "payment_items_sequence"
    )
    @Column(name = "payment_item_id")
    private Long paymentItemId;

    @Column(name = "payment_status_id")
    private Long paymentStatusId;

    @Column(name = "payment_total")
    private Double paymentTotal;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "due_date")
    private LocalDate dueDate;
}
