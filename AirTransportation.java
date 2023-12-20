

public class AirTransportation extends Transportation {

    public AirTransportation(String mode, String rent_ticket, String location,String type, int capacity, double cost, int speed, int maxAltitude ) {
        super(mode, rent_ticket, location, type, capacity, cost, speed );

        this.maxAltitude = maxAltitude;
    }
    private int maxAltitude;

    // fields and methods specific to air transportation
    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public int getMaxAltitude() {
        return maxAltitude;
    }

    //overridden methods
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double travelCost(int passengers) {
        return super.travelCost(passengers);
    }
}
