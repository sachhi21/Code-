package Ticket;

import Buses.Bus;
import Passengers.Passenger;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;


import java.util.Date;
import java.util.List;

public class BusBookingSystemTest {
    private BusBookingSystem bookingSystem;

    @Before
    public void setup() {
        bookingSystem = new BusBookingSystem();
        bookingSystem.addBus(new Bus("B4", "Bus 4", "pune", "bang", 22));

    }

    @Test
    public void testGetAvailableBuses() {
        List<Bus> availableBuses = bookingSystem.getAvailableBuses("pune", "bang");
        Assert.assertEquals(1, availableBuses.size());
        Assert.assertEquals("B4", availableBuses.get(0).getBusNumber());
    }
    @Test
    public void testBookBusTicket() {
        Bus bus = new Bus("B4", "Bus 4", "pune", "bang", 22);
         bookingSystem.addBus(new Bus("B4", "Bus 4", "pune", "bang", 22));
        //Bus bus = new Bus ("B1", "Bus One", "pune", "bang", 3000);
        Passenger passenger = new Passenger("sachin", 23, new Date());
        try {
            bookingSystem.bookBusTicket(bus, passenger);
        } catch (Exception e) {
            Assert.fail("An exception occurred: " + e.getMessage());
        }
    }

}
