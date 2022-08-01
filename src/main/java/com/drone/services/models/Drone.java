package com.drone.services.models;

import com.drone.services.Exceptions.DroneException;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.util.List;

@Entity
@Getter
@Setter
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private Model model;

    @Column(unique=true)
    private String serialNumber;

    private Integer weight;

    private Integer batteryCapacity;

    @Enumerated(EnumType.STRING)
    private State state;

    @OneToMany(mappedBy = "drone", cascade = CascadeType.ALL)
    private List<Medication> medications;

    public Drone (Model model, String serialNumber, Integer weight, Integer batteryCapacity){
        this.model = model;
        this.serialNumber = serialNumber;
        this.batteryCapacity = batteryCapacity;
        if(weight > 500){
            throw new DroneException("weight is too much.");
        }
        this.weight = weight;
        this.state = State.IDLE;
    }
}
