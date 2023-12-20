public class Bus extends LandTransportation {
    private String model;
    private String diesel_natural_gas;


    public Bus(String mode, String rent_ticket, String location, String type, int capacity,
               double cost, int speed, String terrain, String model, String diesel_natural_gas) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, terrain);
        this.model = model;
        this.diesel_natural_gas = diesel_natural_gas;
    }
    public String getModel() {return this.model;}
    public String getDiesel_natural_gas() {return this.diesel_natural_gas;}
    // Setters
    public void setModel(String model) {this.model = model;}
    public void setDiesel_natural_gas(String diesel_natural_gas) {this.diesel_natural_gas = diesel_natural_gas;}


    @Override
    public String toString() {
        return super.toString()+ String.format("%-15s%-10s\n%-15s%-10s\n",
                "Model:", this.model,
                "Gas:", this.diesel_natural_gas)
                ;
    }

    public String travelInstructions(){
        return "The bus stop is located at 102 South 3rd street in downtown Wilmington";
    }

    // fields and methods specific to buses
}
