import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> roomList;
//    private ArrayList<Guest> guestsList;

    public Hotel() {
        this.roomList = new ArrayList<>();
//        this.guestsList = new ArrayList<>();
//        hotelGuestsList();
    }

    public void checkInAGuest(Room room, Guest guest) {
        room.addGuest(guest);
    }

    public void checkOutAGuest(Room room, Guest guest) {
        room.removeGuest(guest);
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void removeRoom(Room room) {
        roomList.remove(room);
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public ArrayList<Guest> hotelGuestList(Room room) {
        return room.getGuestsInRoom();
    }



}
