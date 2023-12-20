public class Bike extends LandTransportation {
    private double wheel_size;
    private String gears;

    public Bike(String mode, String rent_ticket, String location, String type, int capacity, double cost,String terrain, int speed, String gears, double wheel_size ) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, terrain);
        this.wheel_size = wheel_size;
        this.gears = gears;
    }

    public double getWheel_size() {return this.wheel_size;}
    public String getGears() {return this.gears;}
    // Setters
    public void setWheel_size(double wheel_size) {this.wheel_size = wheel_size;}
    public void setGears(String gears) {this.gears = gears;}


    public String toString() {
        return super.toString() + String.format("%-15s%-10s\n%-15s%-10f\n","Gears:", gears, "Wheel Size", wheel_size);
    }

    public String travelInstructions(){
        return "You can pick up your bike from Two Wheeler Dealer on Oleander";
    }
}
