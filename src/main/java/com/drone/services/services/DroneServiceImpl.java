package com.drone.services.services;

import com.drone.services.dtos.DroneDTO;
import com.drone.services.models.Drone;
import com.drone.services.repositories.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroneServiceImpl implements DroneService {
    private final DroneRepository droneRepository;

    @Autowired
    public DroneServiceImpl (DroneRepository droneRepository){
        this.droneRepository = droneRepository;
    }

    @Override
    public Drone registerDrone(DroneDTO newDrone) {
        Drone drone = new Drone(newDrone.getModel(), newDrone.getSerialNumber(), newDrone.getWeight(), newDrone.getBatteryCapacity());
        return droneRepository.save(drone);
    }


}
