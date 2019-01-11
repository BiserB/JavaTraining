package com.telerikacademy.agency.models;

import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.contracts.vehicles.Vehicle;

public class JourneyImpl implements Journey {

    private static final int MIN_DESTINATION_LENGTH = 5;
    private static final int MAX_DESTINATION_LENGTH = 25;
    private static final int MIN_START_LOCATION_LENGTH = 5;
    private static final int MAX_START_LOCATION_LENGTH = 25;
    private static final int MIN_DISTANCE = 5;
    private static final int MAX_DISTANCE = 5000;

    private String destination;
    private int distance;
    private String startLocation;
    private Vehicle vehicle;

    public JourneyImpl(String startLocation, String destination, int distance, Vehicle vehicle){

        this.setDestination(destination);
        this.setDistance(distance);
        this.setStartLocation(startLocation);
        this.setVehicle(vehicle);
    }

    public String getDestination() {
        return this.destination;
    }

    private void setDestination(String destination) {
        validateDestination(destination);
        this.destination = destination;
    }

    public int getDistance() {
        return this.distance;
    }

    private void setDistance(int distance) {
        validateDistance(distance);
        this.distance = distance;
    }

    public String getStartLocation() {
        return this.startLocation;
    }

    private void setStartLocation(String startLocation) {
        validateStartLocation(startLocation);
        this.startLocation = startLocation;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    private void setVehicle(Vehicle vehicle){
        validateObject(vehicle);
        this.vehicle = vehicle;
    }

    public double calculateTravelCosts() {
        return this.vehicle.getPricePerKilometer() * this.distance;
    }

    private void validateDestination(String str) {
        if(str == null || str.length() < MIN_DESTINATION_LENGTH || str.length() > MAX_DESTINATION_LENGTH){
            throw new IllegalArgumentException(
                    String.format("The Destination's length cannot be less than %d or more than %d symbols long.",
                            MIN_START_LOCATION_LENGTH, MAX_START_LOCATION_LENGTH));
        }
    }

    private void validateStartLocation(String str) {
        if(str == null || str.length() < MIN_START_LOCATION_LENGTH || str.length() > MAX_START_LOCATION_LENGTH){
            throw new IllegalArgumentException(
                    String.format("The StartingLocation's length cannot be less than %d or more than %d symbols long.",
                            MIN_START_LOCATION_LENGTH, MAX_START_LOCATION_LENGTH));
        }
    }

    private void validateDistance(int distance){
        if (distance < MIN_DISTANCE || distance > MAX_DISTANCE){
            throw new IllegalArgumentException(
                    String.format("The Distance cannot be less than %d or more than %d kilometers.",
                            MIN_DISTANCE, MAX_DISTANCE));
        }
    }

    private void validateObject(Object obj) {
        if(obj == null){
            throw new IllegalArgumentException();
        }
    }

    public String toString(){
        String result = ("Journey ----" + System.lineSeparator() +
                         "Start location: " + this.startLocation + System.lineSeparator() +
                         "Destination: " + this.destination + System.lineSeparator() +
                         "Distance: " + this.distance + System.lineSeparator() +
                         "Vehicle type: " + this.vehicle.getType().toString() + System.lineSeparator() +
                         "Travel costs: " + this.calculateTravelCosts() );

        return result;
    }
}
