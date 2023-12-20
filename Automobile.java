// Subclasses of LandTransportation
public class Automobile extends LandTransportation {
    private String Color;
    private int Horsepower;
    private String manual_automatic; // is it automatic or manual


    public Automobile(String mode, String rent_ticket, String location, String type, int capacity,
                      double cost, int speed, String terrain, String Color, int Horsepower, String manual_automatic) {
        super(mode, rent_ticket, location, type, capacity, cost, speed, terrain);
        this.Color = Color;
        this.Horsepower = Horsepower;
        this.manual_automatic = manual_automatic;
    }
    public String getColor() {return this.Color;}
    public int getHorsepower() {return this.Horsepower;}
    public String getManual_automatic() {return this.manual_automatic;}
    // Setters
    public void setColor(String Color) {this.Color = Color;}
    public void setHorsepower(int Horsepower) {this.Horsepower = Horsepower;}
    public void setManual_automatic(String manual_automatic) {this.manual_automatic = manual_automatic;}

    @Override
    public String toString() {
        return super.toString() + String.format("%-15s%-10s\n%-15s%-10d\n%-15s%-10s\n",
                "Color: ", this.Color,
                "Horsepower: ", this.Horsepower,
                "Manual or Automatic: ", this.manual_automatic);}

    @Override
    public String travelInstructions() {
        return "Your car reservation is booked. Please pickup form Avais located at WILM";
    }

    @Override
    public double travelCost(int passengers) {
        if (passengers <= 5){
            return super.travelCost(passengers);}
        else{
            System.out.println("You have more then 5 passengers and will need to rent another car");
            double p = (float) passengers;
            double c = (float) getCapacity();
            double total_cost = getCost() * Math.ceil(p/c);
            return total_cost;

        }
    }
}
