import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(2,4, BedroomType.DOUBLEROOM,100);
    }

    @Test
    public void canGetNoOfGuestsInRoom() {
        assertEquals(2, bedroom.getNoOfGuestsInRoom());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void canGetRoomNO() {
        assertEquals(10, bedroom.getRoomNO());
    }

    @Test
    public void bedroomHasAType() {
        assertEquals(BedroomType.DOUBLEROOM, bedroom.getBedroomType());
    }

    @Test
    public void bedroomHasANightlyRate() {
        assertEquals(100.00, bedroom.getNightlyRate(),0.01 );
    }



}
