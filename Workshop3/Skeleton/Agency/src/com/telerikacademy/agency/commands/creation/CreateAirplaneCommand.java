package com.telerikacademy.agency.commands.creation;

import com.telerikacademy.agency.commands.contracts.Command;
import com.telerikacademy.agency.core.contracts.Engine;
import com.telerikacademy.agency.core.factories.AgencyFactory;
import com.telerikacademy.agency.models.contracts.vehicles.Airplane;
import com.telerikacademy.agency.models.contracts.vehicles.Bus;

import java.util.List;

public class CreateAirplaneCommand implements Command {

    private final AgencyFactory factory;
    private final Engine engine;

    public CreateAirplaneCommand(AgencyFactory factory, Engine engine) {
        this.factory = factory;
        this.engine = engine;
    }

    @Override
    public String execute(List<String> parameters) {
        int passengerCapacity;
        double pricePerKilometer;
        boolean hasFreeFood;
        String booleanString = parameters.get(2);

        try {
            passengerCapacity = Integer.parseInt(parameters.get(0));
            pricePerKilometer = Double.parseDouble(parameters.get(1));
            if (booleanString.equals("true")){
                hasFreeFood = true;
            }
            else if(booleanString.equals("false")){
                hasFreeFood = false;
            }
            else {
                throw new IllegalArgumentException();
            }
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Failed to parse CreateAirplane command parameters.");
        }

        Airplane airplane = factory.createAirplane(passengerCapacity, pricePerKilometer, hasFreeFood);
        engine.getVehicles().add(airplane);

        return String.format("Vehicle with ID %d was created.", engine.getVehicles().size() - 1);
    }
}
