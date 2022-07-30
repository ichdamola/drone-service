package com.drone.services.models;

import javax.persistence.*;

@Entity
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
