
public class Train extends LandTransportation {
    private int numCarts;


    public Train(String mode, String rent_ticket, String location, String type, int capacity,
                 double cost, int speed, String terrain, int numCarts) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, terrain );
    }
    public int getNumCarts() {return this.numCarts;}

    // Setters
    public void setNumCarts(int numCarts) {this.numCarts = numCarts;}

    @Override
    public String toString() {
        return super.toString() + String.format("%-17s%-10d\n","Number of Carts: ", numCarts);
    }

    public String travelInstructions(){
        return "Your train leaves at 7pm from US railways at 505 train road";
    }
    // fields and methods specific to trains
}
