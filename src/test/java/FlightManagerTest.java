import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight1;
    Plane airbus3000;
    FlightManager flight1Manager;
    Passenger passenger1;

    @Before
    public void before(){
        airbus3000 = new Plane(PlaneType.AIRBUS3000);
        flight1 = new Flight(airbus3000, "X012", Airport.HND, Airport.LHR, "12:00");
        flight1Manager = new FlightManager(flight1);
        passenger1 = new Passenger("Daisy", 1);

    }
    @Test
    public void hasAFlight(){
        assertEquals(flight1, flight1Manager.getFlight());
    }

    @Test
    public void canCheckReservedWeight(){
        assertEquals(25, flight1Manager.getReservedWeight());
    }
    @Test
    public void canCheckFlightPassengerCount(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1Manager.getFlightPassengerCount());
    }
    @Test
    public void canGetPassengerBagCount(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger1);
        assertEquals(3, flight1Manager.getPassengerBagCount());
    }

    @Test
    public void canCheckBagWeightPP(){
        assertEquals(1.25, flight1Manager.getBagWeightPP(), 0.01 );
    }

    @Test
    public void checkAvailableReservationWeight(){
        flight1.addPassenger(passenger1);
        assertEquals( 23.75 ,flight1Manager.getAvailableReservationWeight(), 0.01);
    }

}
