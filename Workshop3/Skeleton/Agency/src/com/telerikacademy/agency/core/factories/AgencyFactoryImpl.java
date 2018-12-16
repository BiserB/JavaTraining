package com.telerikacademy.agency.core.factories;

import com.telerikacademy.agency.models.*;
import com.telerikacademy.agency.models.contracts.*;
import com.telerikacademy.agency.models.contracts.vehicles.Airplane;
import com.telerikacademy.agency.models.contracts.vehicles.Bus;
import com.telerikacademy.agency.models.contracts.vehicles.Train;
import com.telerikacademy.agency.models.contracts.vehicles.Vehicle;

public class AgencyFactoryImpl implements AgencyFactory {
    public AgencyFactoryImpl() {
    }

    public Bus createBus(int passengerCapacity, double pricePerKilometer) {
        return new BusImpl(passengerCapacity, pricePerKilometer);
    }

    public Airplane createAirplane(int passengerCapacity, double pricePerKilometer, boolean hasFreeFood) {
        return new AirplaneImpl(passengerCapacity, pricePerKilometer, hasFreeFood);
    }

    public Train createTrain(int passengerCapacity, double pricePerKilometer, int carts) {
        return new TrainImpl(passengerCapacity,pricePerKilometer,carts);
    }

    public Journey createJourney(String startLocation, String destination, int distance, Vehicle vehicle) {
        return new JourneyImpl(startLocation, destination, distance, vehicle);
    }

    public Ticket createTicket(Journey journey, double administrativeCosts) {
        return new TicketImpl(journey, administrativeCosts);
    }
}
