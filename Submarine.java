public class Submarine extends WaterTransportation {
    private String maxDepth;

    public Submarine(String mode, String rent_ticket, String location, String type,
                     int capacity, double cost, int speed, String waterType, String maxDepth) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, waterType);
        this.maxDepth = maxDepth;
    }

    public String getMaxDepth() {return maxDepth;}

    public void setMaxDepth(String maxDepth) {this.maxDepth = maxDepth;}

    @Override
    public String toString() {
        return super.toString()+ String.format("%-15s%-10s\n","Max Depth:", this.maxDepth);
    }
    // fields and methods specific to submarines


    @Override
    public String travelInstructions() {
        return "The submarine leaves at 8pm from 112 Port road Wilmington";
    }
}
