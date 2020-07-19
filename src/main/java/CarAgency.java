import java.util.ArrayList;
import java.util.List;

public class CarAgency {
   private ArrayList<Vehicle> listOfCars = new ArrayList(); //list of vehicles
    private String shopName;
    private int numberOfCars;

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public CarAgency(String shopName) { //constructor
        this.listOfCars.clear(); //set the items to 0 somehow //clears the array when the constructor is callecd
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    //display
    public String display(String vehicleType) { //search method
        StringBuilder st = new StringBuilder();

        //return a string with a list of all the vhicles will pass in luxry car and stuff
        //the display method uses a foreach loop and checks all the cars with their name and adds it to a string builder.
        for (Vehicle temp : listOfCars) {
            if (vehicleType.equals("CompactCar")) {
                st.append(temp.toString());
            } else if (vehicleType.equals("LuxuryCar")) {
                st.append(temp.toString());
            } else if (vehicleType.equals("Wagon")) {
                st.append(temp.toString());
            } else if (vehicleType.equals("Truck")) {
                st.append(temp.toString());
            } else {
                System.out.println("Input is invalid");
            }
            return st.toString();
        }
    }

//add methods that add differnt cars depending on what is passed in in the parameters.
        //addCompact car
        public void add(CompactCar vehicle){
            listOfCars.add(vehicle);
            System.out.println("Compact car added");
        }

        //addLuxry car
    public void add(LuxuryCar vehicle){
        listOfCars.add(vehicle);
        System.out.println("Luxury car added");
    }

        //addWagon
    public void add(Wagon vehicle){
        listOfCars.add(vehicle);
        System.out.println("Wagon added");
    }
       //addTruck
    public void add(Truck vehicle){
        listOfCars.add(vehicle);
        System.out.println("truck added");
    }
    }
}

