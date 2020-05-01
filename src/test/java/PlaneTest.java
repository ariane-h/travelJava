import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;

    @Before
    public void before(){
        plane1 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING747, plane1.getPlaneType());
    }
    @Test
    public void canGetPlaneCapacity(){
        assertEquals(10, plane1.getCapacity());
    }
    @Test
    public void canGetPlaneTotalWeight(){
        assertEquals(30, plane1.getTotalWeight());
    }

}
