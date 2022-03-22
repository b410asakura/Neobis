package com.neobis.week6.shipStatus;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ship_statuses")
public class ShipStatus {
    @Id
    @SequenceGenerator(
            name = "ship_statuses_sequence",
            sequenceName = "ship_statuses_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ship_statuses_sequence"
    )
    @Column(name = "ship_status_id")
    private Long shipStatusId;

    @Column(name = "name")
    private String name;
}
