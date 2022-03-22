package com.neobis.week6.textileColor;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "textile_colors")
public class TextileColor {
    @Id
    @SequenceGenerator(
            name = "textile_colors_sequence",
            sequenceName = "textile_colors_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "textile_colors_sequence"
    )
    @Column(name = "color_id")
    private Long colorId;

    @Column(name = "name")
    private String name;
}
