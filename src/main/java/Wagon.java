public class Wagon extends Vehicle implements PassengerVehicle {
    private int numberOfPassengers;

    public Wagon(int id, String brand, String engineNumber, int year, double price, int numberOfPassengers) {
        super(id, brand, engineNumber, year, price);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


    @Override
    public String toString() {
        return super.toString() + "number of passengers: " + getNumberOfPassengers();
    }
}
