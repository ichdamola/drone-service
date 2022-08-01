package com.drone.services.controllers;

import com.drone.services.dtos.DroneDTO;
import com.drone.services.models.Drone;
import com.drone.services.services.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drones")
public class DroneController {
    private final DroneService droneService;

    @Autowired
    public DroneController(DroneService droneService) {
        this.droneService = droneService;
    }

    @PostMapping
    public ResponseEntity<Drone> registerDrone (@RequestBody DroneDTO droneDTO){
        Drone drone = droneService.registerDrone(droneDTO);
        return new ResponseEntity<>(drone, HttpStatus.CREATED);
    }
}
