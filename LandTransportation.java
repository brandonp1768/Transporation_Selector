public class LandTransportation extends Transportation {

    private String terrain;



    public LandTransportation(String mode, String rent_ticket, String location, String type,
                              int capacity, double cost, int speed, String terrain) {
        super(mode, rent_ticket, location, type, capacity, cost, speed);
        this.terrain = terrain;

    }
    public String getTerrain() {return this.terrain;}

    // Setters
    public void setTerrain(String terrain) {this.terrain = terrain;}


    @Override
    public String toString() {
        return super.toString()+ String.format("%-15s%-10s\n","Terrain:", this.terrain);
    }
    // fields and methods specific to land transportation
}
