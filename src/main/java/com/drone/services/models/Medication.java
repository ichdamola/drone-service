package com.drone.services.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Medication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer weight;
    private String code;
    private String image;

    @ManyToOne
    @JoinColumn(name = "drone_id")
    private Drone drone;


}
