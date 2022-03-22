package com.neobis.week6.employeePosition;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee_positions")
public class EmployeePosition {

    @Id
    @SequenceGenerator(
            name = "employee_positions_sequence",
            sequenceName = "employee_positions_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_positions_sequence"
    )
    @Column(name = "position_id")
    private Long positionId;

    @Column(name = "name")
    private String name;

}
