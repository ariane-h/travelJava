import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Flight flight2;

    Plane airbus3000;
    Plane privateplane;

    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

    @Before
    public void before(){
        airbus3000 = new Plane(PlaneType.AIRBUS3000);
        privateplane = new Plane(PlaneType.PRIVATEPLANE);

        passenger1 = new Passenger("Daisy", 1);
        passenger2 = new Passenger("Tim", 2);
        passenger3 = new Passenger("Marsha", 3);

        flight1 = new Flight(airbus3000, "X012", Airport.HND, Airport.LHR, "12:00");
        flight2 = new Flight(privateplane, "M201", Airport.ATL, Airport.DXB, "13:00");
    }

    @Test
    public void hasPlane(){
        assertEquals(airbus3000, flight1.getPlane());
    }
    @Test
    public void hasFlightNumber(){
        assertEquals("X012", flight1.getFlightNumber());
    }
    @Test
    public void hasDepartureAirport(){
        assertEquals(Airport.LHR, flight1.getDepartureAirport());
    }
    @Test
    public void hasDestinationAirport(){
        assertEquals(Airport.HND, flight1.getDestinationAirport());
    }
    @Test
    public void hasDepartureTime(){
        assertEquals("12:00", flight1.getDepartureTime());
    }
    @Test
    public void canCheckAvailableSeats(){
        assertEquals(20, flight1.getAvailableSeats());
    }
    @Test
    public void flightStartsEmpty(){
        assertEquals(0, flight1.getBookedPassengersCount());
    }

    @Test
    public void canBookAPassenger(){
        flight1.addPassenger(passenger1);
        assertEquals(1, flight1.getBookedPassengersCount());
        assertEquals(19, flight1.getAvailableSeats());
    }
    @Test
    public void canOnlyBookPassengerIfAvailableSeats(){
        flight2.addPassenger(passenger1);
        flight2.addPassenger(passenger2);
        flight2.addPassenger(passenger3);
        assertEquals(2, flight2.getBookedPassengersCount());
        assertEquals(0, flight2.getAvailableSeats());
    }

}
