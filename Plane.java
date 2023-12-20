
public class Plane extends AirTransportation {

    private String airline;
    public Plane(String mode, String rent_ticket, String location, String type, int capacity, double cost, int speed, int maxAltitude, String airline) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, maxAltitude);
        this.airline = airline;
    }

    public String getAirline() {return airline;}

    public void setAirline(String airline) {this.airline = airline;}

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s%-10s\n","Airline: ", airline);
    }

    public String travelInstructions(){
        return "Your flight leaves at 7pm from WILM";
    }
}
