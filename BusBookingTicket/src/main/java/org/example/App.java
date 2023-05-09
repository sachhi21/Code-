package org.example;

/**
 * Hello world!
 *
 */
import Buses.Bus;
import Passengers.Passenger;
import Ticket.BusBookingSystem;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {

        BusBookingSystem bookingSystem = new BusBookingSystem();
        bookingSystem.addBus(new Bus("B4", "Bus 4", "pune", "bang", 22));
        bookingSystem.addBus(new Bus("B1", "Bus One", "pune", "bang", 3000));
        bookingSystem.addBus(new Bus("B2", "Bus Two", "pune", "chennai", 30));
        bookingSystem.addBus(new Bus("B3", "Bus Three", "pune", "bang", 22));
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter Exit to exit the Application OR Click Enter toproceed with Booking");
            String Input = sc.nextLine();
            if (Input.equalsIgnoreCase("exit")) {
                break;
            } else {

                System.out.println("Enter Source");
                String source = sc.nextLine();
                System.out.println("Enter Destination");
                String destination = sc.nextLine();

                try {

                    List<Bus> availableBuses = bookingSystem.getAvailableBuses(source, destination);

                    if (availableBuses.isEmpty()) {
                        System.out.println("\nNo buses available for the given source and destination.");
                        continue;
                    }

                    System.out.println("\nAvailable Buses:");
                    for (Bus bus : availableBuses) {
                        System.out.println(bus.getBusNumber() + " - " + bus.getBusName());
                    }

                    System.out.println("Enter Bus Number");
                    String busNumber = sc.nextLine();

                    Bus selectedBus = null;
                    for (Bus bus : availableBuses) {
                        if (bus.getBusNumber().equalsIgnoreCase(busNumber)) {
                            selectedBus = bus;
                            break;
                        }
                    }

                    // if (selectedBus == null) {
                    // System.out.println("Invalid bus number. Please try again.");
                    // continue;
                    // }

                    System.out.println("Enter name");
                    String name = sc.nextLine();
                    System.out.println("Enter age");
                    int age = Integer.parseInt(sc.nextLine());
                    Date dateOfJourney = new Date();

                    Passenger passenger = new Passenger(name, age, dateOfJourney);

                    try {
                        bookingSystem.bookBusTicket(selectedBus, passenger);
                    } catch (Exception e) {
                        System.out.println("\nAn error occurred while booking the ticket: " + e.getMessage());
                    }
                } catch (Exception e) {
                    System.out.println("\nAn error occurred: " + e.getMessage());
                }
            }

        }
    }
}