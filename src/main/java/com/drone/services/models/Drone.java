package com.drone.services.models;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.List;

@Entity
public class Drone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Model model;

    @Max(value=100, message="input number more than 100.")
    private String serialNumber;

    @Max(value=500, message="weight is too much.")
    private Integer weight;

    private Integer batteryCapacity;

    @Enumerated(EnumType.STRING)
    private State state;

    @OneToMany(mappedBy = "drone", cascade = CascadeType.ALL)
    private List<Medication> medications;
}
