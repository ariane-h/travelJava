import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight1;
    Plane airbus3000;


    @Before
    public void before(){
        airbus3000 = new Plane(PlaneType.AIRBUS3000);

        flight1 = new Flight(airbus3000, "X012", Airport.HND, Airport.LHR, "12:00");
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

}
