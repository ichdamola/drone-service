package com.drone.services.Exceptions;

public class DroneException extends RuntimeException{
    public DroneException() {
    }

    public DroneException(String message) {
        super(message);
    }

    public DroneException(String message, Throwable cause) {
        super(message, cause);
    }

    public DroneException(Throwable cause) {
        super(cause);
    }
}