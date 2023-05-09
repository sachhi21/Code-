package Passengers;

import java.util.*;

public class Passenger {
    private String name;
    private int age;
    private Date dateOfJourney;

    public Passenger(String name, int age, Date dateOfJourney) {
        this.name = name;
        this.age = age;
        this.dateOfJourney = dateOfJourney;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDateOfJourney() {
        return dateOfJourney;
    }
}
