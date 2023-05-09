package Buses;
import java.util.*;
import java.util.stream.Collectors;

public class Bus implements Comparable<Bus> {
    private String busNumber;
    private String busName;
    private String source;
    private String destination;
    private double ticketPrice;

    public Bus(String busNumber, String busName, String source, String destination, double ticketPrice) {
        this.busNumber = busNumber;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public String getBusName() {
        return busName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public int compareTo(Bus otherBus) {
        return busNumber.compareTo(otherBus.getBusNumber());
    }
}
