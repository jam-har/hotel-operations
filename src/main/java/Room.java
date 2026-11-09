public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied; //match variable to getter
    private boolean dirty;
    private boolean available;//should not be attribute

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return available; //return !isOccupied && !isDirty
    }

/*    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;

        what constructor should be
    } */
}
