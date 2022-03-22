package com.neobis.week6.paymentStatus;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "payment_statuses")
public class PaymentStatus {
    @Id
    @SequenceGenerator(
            name = "payment_statuses_sequence",
            sequenceName = "payment_statuses_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "payment_statuses_sequence"
    )
    @Column(name = "payment_status_id")
    private Long paymentStatusId;

    @Column(name = "name")
    private String name;
}
