package com.drone.services.dtos;

import com.drone.services.models.Model;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

@Data
public class DroneDTO {
    @NotNull
    private Model model;

    @NotNull
    @Max(value=100, message="input number more than 100.")
    private String serialNumber;

    @NotNull
    @Max(value=500, message="weight is too much.")
    private Integer weight;

    @NotNull
    private Integer batteryCapacity;
}
