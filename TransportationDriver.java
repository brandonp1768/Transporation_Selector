
import java.util.InputMismatchException;
import java.util.Scanner;
public class TransportationDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String transportationType;

        System.out.print("What type of transportation would you like to use Air, Water, or Land? ");
        transportationType = input.nextLine();

        //create array to hold transportation objects
        Transportation[] options;

        //determine which objects to create an instance of
        switch (transportationType.toLowerCase()) {
            case "land":

                options = new LandTransportation[]{new Bus("Land", "Ticket", "Walker Street",
                        "Bus", 35, 14.99, 70,"Flat","EZ Rider II","Natural Gas")
                        , new Automobile("Land", "Rental", "WILM Avais", "Automobile",
                        5, 79.99, 110,"Hilly","Blue",150,"Automatic")
                        , new Bike("Land", "Rental", "Two Wheeler Dealer", "Bike", 1,
                        9.99, "Flat",15,"Yes",22.5)
                        , new Train("Land", "Ticket", "Train Yard", "Train", 340,
                        40, 70, "Flat",30)};
                break;
            case "air":
                options = new AirTransportation[]{new Plane("Air", "Ticket", "WILM", "Plane",
                        150, 300, 100, 30000, "Delta"),
                        new Helicopter("Air", "Ticket", "WILM", "Helicopter", 4,
                                200, 80, 2500, "something"),
                        new Dirigible("Air", "Ticket", "WILM", "Dirigible", 48,
                                7500, 7, 400, "Gray and white"),
                        new HotAirBalloon("Air", "Ticket", "WILM", "Hot Ait Balloon",
                                8, 300, 5, 300, "1000 pounds")};
                break;
            case "water":
                options = new WaterTransportation[]{new Ship("Water", "Ticket", "148 ship yard",
                        "Ship", 400, 250, 25,"Ocean","Cruise"),
                        new Boat("Water", "Rental", "Wrightsvile Beach ", "boat", 6,
                                800, 30,"Lake","Fishing Boat"),
                        new Submarine("Water", "Ticket", "WILM ", "Submarine", 6,
                                3000, 16,"Ocean", "4000 feet")};
                break;
            default:
                System.out.println("Invalid transportation type!");

                return;
        }
        System.out.println("The options for " + transportationType + " transportation");
        System.out.printf("%-10s%-25s%-25s%-25s%-25s%-25s%-25s\n","Option", "Mode", "Purchase", "Location", "Capacity",
                "Cost per person", "Avg Speed");

        //loop to confirm choice
        for (int i = 0; i < options.length; i++) {
            System.out.printf("%-10d%-25s%-25s%-25s%-25s%-25s%-25s\n",i+1, options[i].getType(), options[i].getRent_ticket(),
                    options[i].getLocation(), options[i].getCapacity(), options[i].getCost(), options[i].getSpeed());
        }
        boolean Continue = false;
        int mode = 0;
          while (!Continue) {
              System.out.print("Which option would you like to use (number)? ");
              mode = input.nextInt();
              System.out.print(options[mode - 1].toString());
              System.out.print("Are you sure this is the option you want? ");
              String conformation = input.next();
              if (conformation.equalsIgnoreCase("yes")) {
                  Continue = true;
              }
              else if (!conformation.equalsIgnoreCase("no")){
                  System.out.println("Please Enter Yes or No!");
              }
          }
        //determine the amount of passengers and display total cost
        try{
        System.out.print("How many passengers do you have? ");
        int passengers = input.nextInt();

        double total = options[mode-1].travelCost(passengers);
        System.out.printf("%s%.2f\n","The total cost of travel will be $", total);}
        catch (InputMismatchException e) {
            System.out.print("You must enter a number!");
        }

        //display travel instructions
        System.out.print(options[mode-1].travelInstructions());
        }
    }




