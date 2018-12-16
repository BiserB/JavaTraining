package com.telerikacademy.agency.models;

import com.sun.org.apache.bcel.internal.generic.ILOAD;
import com.telerikacademy.agency.models.contracts.vehicles.Train;
import com.telerikacademy.agency.models.enums.VehicleType;

public class TrainImpl extends VehicleBase implements Train {

    private static final int MIN_PASSENGER_CAPACITY = 30;
    private static final int MAX_PASSENGER_CAPACITY = 150;
    private static final int MIN_CARTS = 1;
    private static final int MAX_CARTS = 15;
    private static final VehicleType TYPE = VehicleType.Land;

    private int carts;

    public TrainImpl(int passengerCapacity, double pricePerKilometer, int carts) {
        super(passengerCapacity, pricePerKilometer, TYPE);
        this.setCarts(carts);
    }

    public String getName() {
        return "train";
    }

    protected int getMinCapacity() {
        return MIN_PASSENGER_CAPACITY;
    }

    protected int getMaxCapacity() {
        return MAX_PASSENGER_CAPACITY;
    }

    public int getCarts() {
        return this.carts;
    }

    private void setCarts(int carts) {
        validateCarts(carts);
        this.carts = carts;
    }

    private void validateCarts(int carts) {
        if (carts < MIN_CARTS || carts > MAX_CARTS){
            throw new IllegalArgumentException(
                    String.format("A train cannot have less than %d cart or more than %d carts.",
                            MIN_CARTS, MAX_CARTS));
        }
    }

    public String toString(){
        String result = "Train ----" + System.lineSeparator() + super.toString() + "Carts amount: " + this.carts;

        return result;
    }
}
