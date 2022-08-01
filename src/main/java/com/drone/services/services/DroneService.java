package com.drone.services.services;

import com.drone.services.dtos.DroneDTO;
import com.drone.services.models.Drone;

public interface DroneService {
    Drone registerDrone(DroneDTO newDrone);

}
