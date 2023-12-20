public class Dirigible extends AirTransportation {
    private String unique;
    public Dirigible(String mode, String rent_ticket, String location, String type, int capacity, double cost, int speed, int maxAltitude, String unique) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, maxAltitude );
        this.unique = unique;
    }

    public String getUnique() {return unique;}

    public void setUnique(String unique) {this.unique = unique;}

    public String toString() {
        return super.toString() + String.format("%-10s%-10s\n","Unique: ", unique);}

    public String travelInstructions(){
        return "The Dirigible leaves from WILM at 4pm";}
}
    // fields and methods specific to dirigibles

