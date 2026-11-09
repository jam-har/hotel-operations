public class Reservation {
    private String roomType;
    private double price;//not a separate variable, derived getter
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType; // see comment below
    }

    public double getPrice() {
        return price;
    }

    //should be getter only getPrice
    public void setPrice(double price) {
        if (roomType.equalsIgnoreCase("king")) {
            price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124;
        }
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return weekend;
    }

    //no setter include info in price getter
    public void setWeekend(boolean weekend) {
        if (weekend) {
            price = price * 1.10;
        }
        this.weekend = weekend;
    }

    public double getReservationTotal() {
        return price * numberOfNights;
    }
}
