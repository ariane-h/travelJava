import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before(){
        passenger1 = new Passenger("Sandara", 2);
    }

    @Test
    public void passengerHasAName(){
        assertEquals("Sandara", passenger1.getName());
    }
    @Test
    public void passengerHasSomeBags(){
        assertEquals(2, passenger1.countBags());
    }

}
