import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinningRoomTest {

    DinningRoom dinningRoom;

    @Before
    public void before() {
        dinningRoom = new DinningRoom(25,"Nomada");
    }

    @Test
    public void canGetCapacity() {
        assertEquals(25, dinningRoom.getCapacity());
    }

    @Test
    public void dinningRoomHasAName() {
        assertEquals("Nomada", dinningRoom.getName());
    }


}
