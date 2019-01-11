package com.telerikacademy.agency.models;

import com.telerikacademy.agency.models.contracts.vehicles.Airplane;
import com.telerikacademy.agency.models.enums.VehicleType;

public class AirplaneImpl extends  VehicleBase implements Airplane {

    private static final VehicleType TYPE = VehicleType.Air;
    private boolean hasFreeFood;

    public AirplaneImpl(int passengerCapacity, double pricePerKilometer, boolean hasFreeFood) {
        super(passengerCapacity, pricePerKilometer, TYPE);
        this.hasFreeFood = hasFreeFood;
    }

    @Override
        public boolean hasFreeFood() {
        return false;
    }

    @Override
    public String getName() {
        return "airplane";
    }

    public String toString(){

        String freeFood = this.hasFreeFood == true ? "True" : "False";

        String result = "Airplane ----" + System.lineSeparator() + super.toString() + "Has free food: " + freeFood;

        return result;
    }
}
