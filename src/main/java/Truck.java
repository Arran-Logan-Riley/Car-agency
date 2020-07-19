public class Truck extends Vehicle implements PassengerVehicle{ //the diagram says it implements PassengerVehicle
    private double loadCapacity;
    private int axleNumber;

    public Truck(int id, String brand, String engineNumber, int year, double price, double loadCapacity, int axleNumber) {
        super(id, brand, engineNumber, year, price);
        this.loadCapacity = loadCapacity;
        this.axleNumber = axleNumber;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getAxleNumber() {
        return axleNumber;
    }

    public void setAxleNumber(int axleNumber) {
        this.axleNumber = axleNumber;
    }


    @Override
    public String toString() {
        return super.toString() + "load capacity: " + getLoadCapacity() + "number of axis: " + getAxleNumber();
    }


    @Override
    public int getNumberOfPassengers() {
        return 3;
    }
}
