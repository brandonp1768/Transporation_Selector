
public class HotAirBalloon extends AirTransportation {

    private String maxWeight;
    public HotAirBalloon(String mode, String rent_ticket, String location , String type, int capacity, double cost, int speed, int maxAltitude, String maxWeight) {
        super(mode, rent_ticket, location , type, capacity, cost, speed, maxAltitude);
        this.maxWeight = maxWeight;
    }

    public String getMaxWeight() {return maxWeight;}

    public void setMaxWeight(String maxWeight) {this.maxWeight = maxWeight;}

    @Override
    public String toString() {
        return super.toString()  + String.format("%-15s%-10s\n","Max Weight:" , maxWeight);

    }

    public String travelInstructions(){
        return "The Hot Air Balloon leaves from WILM at 3pm";}
    // fields and methods specific to hot air balloons
}
