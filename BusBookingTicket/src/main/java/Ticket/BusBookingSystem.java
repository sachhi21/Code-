package Ticket;

import Buses.Bus;
import Passengers.Passenger;

import java.util.*;
import java.util.stream.Collectors;

public class BusBookingSystem {
    private List<Bus> buses;

    public BusBookingSystem() {
        buses = new ArrayList<>();
    }

    public void addBus(Bus bus) {
        buses.add(bus);
    }

    public List<Bus> getAvailableBuses(String source, String destination) {
        return buses.stream()
                .filter(bus -> bus.getSource().equalsIgnoreCase(source)
                        && bus.getDestination().equalsIgnoreCase(destination))
                .sorted(Comparator.comparing(Bus::getBusNumber))
                .collect(Collectors.toList());
    }

    public void bookBusTicket(Bus bus, Passenger passenger) throws Exception {
        if (!buses.contains(bus)) {
            throw new Exception("Bus not found!");
        }

        System.out.println("Ticket Details");

        System.out
                .println("\nBus number: " + bus.getBusNumber() + " \nBus Name : " + bus.getBusName() + "\nSource :"
                        + bus.getSource() + " \nDestination" + bus.getDestination() + "\nPassenger Name:"
                        + passenger.getName() + "\n Passenger Age : "
                        + passenger.getAge() + "\nDate of Journey" + passenger.getDateOfJourney()
                        + "\n Ticket Price " + bus.getTicketPrice());

    }
}