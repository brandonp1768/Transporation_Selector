

public class Transportation {

    // fields and methods that are common to all types of transportation

    public Transportation(String mode, String rent_ticket, String location, String type, int capacity, double cost, int speed){

        this.mode = mode;
        this.rent_ticket = rent_ticket;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
        this.cost = cost;
        this.speed = speed;
    }
    private String type;

    private String mode;
    private int capacity;

    private double cost;

    private String rent_ticket;

    private String location;

    private int speed;

    //getters
    public String getType() {
        return type;}

    public int getSpeed() {
        return speed;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getLocation() {
        return location;
    }

    public String getRent_ticket() {
        return rent_ticket;
    }

    public String getMode() {
        return mode;
    }

    //setters
    public void setType(String type) {
        this.type = type;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRent_ticket(String rent_ticket) {
        this.rent_ticket = rent_ticket;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //other methods
    public String toString() {
        return String.format("%-15s%-10s\n%-15s%-10s\n%-15s%-10s\n%-15s%-10d\n%-15s%s%-10.2f\n%-15s%-10d\n","Mode ",this.type,
                "Purchasing: ",this.rent_ticket,
                "Location: ",this.location,
                "Capacity: ",this.capacity,
                "Cost: ","$",this.cost,
                "Max Speed: ",this.speed);
    }

    public String travelInstructions(){
        return "";
    }

    public double travelCost(int passengers) {

        return passengers * this.cost;


    }

}

