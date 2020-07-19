public class CompactCar extends Vehicle implements PassengerVehicle {
    private int numberOfPassengers;

    public CompactCar(int id, String brand, String engineNumber, int year, double price, int numberOfPassengers) { //constructor to construct the car
        super(id, brand, engineNumber, year, price);
        this.numberOfPassengers = numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers; //return the number of passengers
    } //get the number of passengers from the passengerVehicle interface

    @Override
    public String toString() { //to string to push the number of passengers to a string
        return super.toString() + "number of passengers: " + getNumberOfPassengers();
    }
}
