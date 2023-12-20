

public class WaterTransportation extends Transportation {
    private String waterType;
    public WaterTransportation(String mode, String rent_ticket, String location, String type, int capacity, double cost, int speed, String waterType) {
        super(mode, rent_ticket, location, type, capacity, cost, speed);
        this.waterType = waterType;
    }

    public String getWaterType() {return waterType;}

    public void setWaterType(String waterType) {this.waterType = waterType;}

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s%-10s\n",
               "Water Type: ", this.waterType);}
    // fields and methods specific to water transportation
}
