import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(2,10, BedroomType.DOUBLEROOM,100);
    }

    @Test
    public void canGetNoOfGuestsInRoom() {
        assertEquals(0, bedroom.getNoOfGuestsInRoom());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(2, bedroom.getCapacity());
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

    @Test
    public void canAddAGuestToRoom() {
        Guest guest1 = new Guest("Davina");
        bedroom.addGuest(guest1);
        assertEquals(1, bedroom.getNoOfGuestsInRoom());
    }

    @Test
    public void canRemoveAGuestFromRoom() {
        Guest guest1 = new Guest("Maria");
        bedroom.addGuest(guest1);
        bedroom.removeGuest(guest1);
        assertEquals(0,bedroom.getNoOfGuestsInRoom());
    }



}
