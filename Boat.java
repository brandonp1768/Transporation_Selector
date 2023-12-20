
public class Boat extends WaterTransportation {

    private String fish_ferry;

    public Boat(String mode, String rent_ticket, String location, String type, int capacity, double cost, int speed, String waterType, String fish_ferry) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, waterType);
        this.fish_ferry = fish_ferry;
    }

    public String getFish_ferry() {return fish_ferry;}

    public void setFish_ferry(String fish_ferry) {this.fish_ferry = fish_ferry;}

    @Override
    public String toString() {
       return super.toString() + String.format("%-15s%-10s\n",
                "Boat Type: ", this.fish_ferry);}
    // fields and methods specific to boats

    public String travelInstructions() {
        return "Your boat reservation is booked. Please pickup at 112 Boat dock ave located at Wrightsvile Beach";}
    public double travelCost(int passengers) {
        if (passengers <= 5) {
            return super.travelCost(passengers);
        } else {
            System.out.println("You have more then 5 passengers and will need to rent another boat");
            return this.getCost() * 2;
        }
    }
}
