import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {

    Conference conference;

    @Before
    public void before() {
        conference = new Conference(50, "Balmoral",500.00);
    }

    @Test
    public void canGetCapacity() {
        assertEquals(50, conference.getCapacity());
    }

    @Test
    public void roomHasAName() {
        assertEquals("Balmoral", conference.getName());
    }

    @Test
    public void roomHasARate() {
        assertEquals(500.00, conference.getDailyRate(), 0.01);

    }
}
