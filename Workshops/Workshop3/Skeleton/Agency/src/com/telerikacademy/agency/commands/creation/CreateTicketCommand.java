package com.telerikacademy.agency.commands.creation;

import com.telerikacademy.agency.commands.contracts.Command;
import com.telerikacademy.agency.core.contracts.Engine;
import com.telerikacademy.agency.core.factories.AgencyFactory;
import com.telerikacademy.agency.models.TicketImpl;
import com.telerikacademy.agency.models.contracts.Journey;
import com.telerikacademy.agency.models.contracts.Ticket;
import com.telerikacademy.agency.models.contracts.vehicles.Vehicle;

import java.util.List;

public class CreateTicketCommand implements Command {

    private final AgencyFactory factory;
    private final Engine engine;

    public CreateTicketCommand(AgencyFactory factory, Engine engine) {
        this.factory = factory;
        this.engine = engine;
    }

    public String execute(List<String> parameters) {

        Journey journey;
        double administrativeCosts;
        Ticket ticket;

        try {
            int journeyId = Integer.parseInt(parameters.get(0));
            journey = engine.getJourneys().get(journeyId);
            administrativeCosts = Double.parseDouble(parameters.get(1));
            ticket = new TicketImpl(journey, administrativeCosts);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to parse CreateTicket command parameters.");
        }

        engine.getTickets().add(ticket);

        return String.format("Ticket with ID %s was created.", engine.getTickets().size() - 1);
    }
}
