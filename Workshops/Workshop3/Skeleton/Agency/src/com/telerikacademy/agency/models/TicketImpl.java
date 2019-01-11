package com.telerikacademy.agency.models;

import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.contracts.Ticket;

public class TicketImpl implements Ticket {

    private double administrativeCosts;
    private Journey journey;

    public TicketImpl(Journey journey, double administrativeCosts){
        this.setAdministrativeCosts(administrativeCosts);
        this.setJourney(journey);
    }

    public double getAdministrativeCosts() {
        return this.administrativeCosts;
    }

    private void setAdministrativeCosts(double administrativeCosts) {
        validateCosts(administrativeCosts);
        this.administrativeCosts = administrativeCosts;
    }

    public Journey getJourney() {
        return this.journey;
    }

    private void setJourney(Journey journey) {
        validateObject(journey);
        this.journey = journey;
    }

    public double CalculatePrice() {
        return this.administrativeCosts + this.journey.calculateTravelCosts();
    }

    private void validateObject(Object obj) {
        if(obj == null){
            throw new IllegalArgumentException();
        }
    }

    private void validateCosts(double administrativeCosts) {
        if (administrativeCosts <= 0){
            throw new IllegalArgumentException();
        }
    }

    public String toString(){
        String result = "Ticket ----" + System.lineSeparator() +
                        "Destination: " + this.journey.getDestination() + System.lineSeparator() +
                        "Price: " + this.CalculatePrice();

        return result;
    }
}
