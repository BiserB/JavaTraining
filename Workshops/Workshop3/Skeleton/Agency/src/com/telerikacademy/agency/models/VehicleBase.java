package com.telerikacademy.agency.models;

import com.telerikacademy.agency.models.contracts.vehicles.Vehicle;
import com.telerikacademy.agency.models.enums.VehicleType;

import java.text.DecimalFormat;

public abstract class VehicleBase implements Vehicle {

    private static final int MIN_PASSENGER_CAPACITY = 1;
    private static final int MAX_PASSENGER_CAPACITY = 800;

    private static final double MIN_PRICE_PER_KM = 0.10;
    private static final double MAX_PRICE_PER_KM = 2.50;

    private int passengerCapacity;
    private double pricePerKilometer;
    private VehicleType vehicleType;

    public VehicleBase(int passengerCapacity, double pricePerKilometer, VehicleType vehicleType) {

        this.setPassengerCapacity(passengerCapacity);
        this.setPricePerKilometer(pricePerKilometer);
        this.setType(vehicleType);
    }

    public abstract String getName();

    public int getPassengerCapacity() {
        return this.passengerCapacity;
    }

    private void setPassengerCapacity(int passengerCapacity) {
        validateCapacity(passengerCapacity);
        this.passengerCapacity = passengerCapacity;
    }

    public VehicleType getType() {
        return this.vehicleType;
    }

    public void setType(VehicleType vehicleType) {
        validateObject(vehicleType);
        this.vehicleType = vehicleType;
    }

    public double getPricePerKilometer() {
        return this.pricePerKilometer;
    }

    private void setPricePerKilometer(double price){
        validatePrice(price);
        this.pricePerKilometer = price;
    }

    protected int getMinCapacity(){
        return MIN_PASSENGER_CAPACITY;
    }

    protected int getMaxCapacity(){
        return MAX_PASSENGER_CAPACITY;
    }

    private void validateCapacity(int capacity){

        if (capacity < getMinCapacity() || capacity > getMaxCapacity()){

            if(this.getName() == "airplane"){
                throw new IllegalArgumentException(
                        String.format("A vehicle with less than %d passengers or more than %d passengers cannot exist!",
                                this.getMinCapacity(), this.getMaxCapacity()));
            }

            throw new IllegalArgumentException(
                    String.format("A %s cannot have less than %d passengers or more than %d passengers.",
                            this.getName(),this.getMinCapacity(), this.getMaxCapacity()));
        }
    }

    protected void validateObject(Object obj) {
        if(obj == null){
            throw new IllegalArgumentException();
        }
    }

    private void validatePrice(double price) {
        if (price < MIN_PRICE_PER_KM || price > MAX_PRICE_PER_KM){
            throw new IllegalArgumentException(
                    String.format("A vehicle with a price per kilometer lower than $%.2f or higher than $%.2f cannot exist!",
                            MIN_PRICE_PER_KM, MAX_PRICE_PER_KM));
        }
    }

    public String toString(){

        DecimalFormat dec = new DecimalFormat("#0.00");


        String result = "Passenger capacity: " + this.passengerCapacity + System.lineSeparator() +
                        "Price per kilometer: " + dec.format(pricePerKilometer) + System.lineSeparator() +
                        "Vehicle type: " + this.vehicleType.name() + System.lineSeparator();

        return result;
    }
}
