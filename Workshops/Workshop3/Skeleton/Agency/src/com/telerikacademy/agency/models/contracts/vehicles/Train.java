package com.telerikacademy.agency.models.contracts.vehicles;

import com.telerikacademy.agency.models.enums.VehicleType;

public interface Train extends Vehicle {

    double getPricePerKilometer();

    void setType(VehicleType vehicleType);

    int getCarts();
}
