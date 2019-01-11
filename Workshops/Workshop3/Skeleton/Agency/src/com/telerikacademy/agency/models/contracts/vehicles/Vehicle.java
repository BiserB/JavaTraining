package com.telerikacademy.agency.models.contracts.vehicles;

import com.telerikacademy.agency.models.enums.VehicleType;

public interface Vehicle {

    int getPassengerCapacity();

    double getPricePerKilometer();

    VehicleType getType();
}
