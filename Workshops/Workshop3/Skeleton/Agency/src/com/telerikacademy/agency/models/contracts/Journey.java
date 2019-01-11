package com.telerikacademy.agency.models.contracts;

import com.telerikacademy.agency.models.contracts.vehicles.Vehicle;

public interface Journey {

    String getDestination();

    int getDistance();

    String getStartLocation();

    Vehicle getVehicle();

    double calculateTravelCosts();
}
