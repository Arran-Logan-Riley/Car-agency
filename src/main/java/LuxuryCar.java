public class LuxuryCar extends Vehicle implements PassengerVehicle {
    private int numberOfPassengers;

    //constructor for the luxury car. This extends vehicle to add the properties. this also in: compactCar, luxury car, Wagon and truck.
    public LuxuryCar(int id, String brand, String engineNumber, int year, double price, int numberOfPassengers) {
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
