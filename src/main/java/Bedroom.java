public class Bedroom extends Room {

    private int roomNO;
    private BedroomType bedroomType;
    private double nightlyrate;

    public Bedroom(int capacity, int roomNO, BedroomType bedroomType, double nightlyrate) {
        super( capacity);
        this.roomNO = roomNO;
        this.bedroomType = bedroomType;
        this.nightlyrate = nightlyrate;

    }


    public int getRoomNO() {
        return roomNO;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public double getNightlyRate() {
        return nightlyrate;
    }

}
