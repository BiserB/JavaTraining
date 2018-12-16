package com.telerikacademy.agency.models;

import com.telerikacademy.agency.models.contracts.vehicles.Bus;
import com.telerikacademy.agency.models.enums.VehicleType;

public class BusImpl extends VehicleBase implements Bus {

    private static final int MIN_PASSENGER_CAPACITY = 10;
    private static final int MAX_PASSENGER_CAPACITY = 50;
    private static final VehicleType TYPE = VehicleType.Land;

    public BusImpl(int passengerCapacity, double pricePerKilometer) {
        super(passengerCapacity, pricePerKilometer, TYPE);
    }

    @Override
    public String getName() {
        return "bus";
    }

    protected int getMinCapacity() {
        return MIN_PASSENGER_CAPACITY;
    }

    protected int getMaxCapacity() {
        return MAX_PASSENGER_CAPACITY;
    }

    public String toString(){
        String result = "Bus ----" + System.lineSeparator() + super.toString();

        return result.trim();
    }
}
