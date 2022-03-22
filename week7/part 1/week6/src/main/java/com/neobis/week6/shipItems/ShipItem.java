package com.neobis.week6.shipItems;


import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "ship_items")
public class ShipItem {
    @Id
    @SequenceGenerator(
            name = "ship_items_sequence",
            sequenceName = "ship_items_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ship_items_sequence"
    )
    @Column(name = "ship_item_id")
    private Long shipItemId;

    @Column(name = "ship_status_id")
    private Long shipStatusId;

    @Column(name = "shipper_id")
    private Long shipperId;

    @Column(name = "shipped_date")
    private LocalDate shippedDate;
}
