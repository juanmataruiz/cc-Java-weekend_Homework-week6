import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> roomList;

    public Hotel() {
        this.roomList = new ArrayList<>();
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

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public void removeRoom(Room room) {
        roomList.remove(room);
    }
}
