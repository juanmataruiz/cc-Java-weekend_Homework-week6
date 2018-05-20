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

    public void removeRoom(Room room) {
        roomList.remove(room);
    }

    public ArrayList<Room> getRoomList() {
        return roomList;
    }

    public ArrayList<Guest> hotelGuestList(Room room) {
        return room.getGuestsInRoom();
    }

    public ArrayList<Room> listOfEmptyRooms() {
        ArrayList<Room> vacantRooms = new ArrayList<>();
        for (Room room : roomList) {
            if (room.getGuestsInRoom().isEmpty()) {
                vacantRooms.add(room);
            }
        }
        return vacantRooms;
    }

}

