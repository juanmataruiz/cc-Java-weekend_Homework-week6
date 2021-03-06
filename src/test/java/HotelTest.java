import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Guest guest;
    Room room;



    @Before
    public void before() {
        hotel = new Hotel();
        guest = new Guest("Davina");
        room = new Bedroom(2,4, BedroomType.DOUBLEROOM,100);

    }



    @Test
    public void canCheckInAGuest() {
        hotel.checkInAGuest(room, guest);
        assertEquals(1, room.getNoOfGuestsInRoom());
    }

    @Test
    public void canCheckOutAGuest() {
        hotel.checkInAGuest(room, guest);
        hotel.checkOutAGuest(room, guest);
        assertEquals(0, room.getNoOfGuestsInRoom());
    }

    @Test
    public void canAddRoomToHotel() {
        hotel.addRoom(room);
        assertEquals(1, hotel.getRoomList().size());
    }

    @Test
    public void canRemoveToHotel() {
        hotel.addRoom(room);
        hotel.removeRoom(room);
        assertEquals(0, hotel.getRoomList().size());
    }

    @Test
    public void getHotelGuestList() {
        hotel.checkInAGuest(room, guest);
        assertEquals(1, hotel.hotelGuestList(room).size());
    }

    @Test
    public void getListOfEmptyRooms() {
        Room room1 = new Bedroom(1,5, BedroomType.SINGLEROOM,80);
        hotel.addRoom(room);
        hotel.addRoom(room1);
        hotel.checkInAGuest(room, guest);
        hotel.checkInAGuest(room1, guest);
        assertEquals(0, hotel.listOfEmptyRooms().size());
    }
}
