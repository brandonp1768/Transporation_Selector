public class Ship extends WaterTransportation {
    private String crusie_cargo;

    public Ship(String mode, String rent_ticket, String location, String type, int capacity, double cost, int speed, String waterType, String crusie_cargo) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, waterType);

        this.crusie_cargo =crusie_cargo;
    }

    public String getCrusie_cargo() {return crusie_cargo;}

    public void setCrusie_cargo(String crusie_cargo) {this.crusie_cargo = crusie_cargo;}

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s%-10s\n",
                "Ship Type: ", this.crusie_cargo);}


}
