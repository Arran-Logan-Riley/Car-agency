public abstract class Vehicle {
    private int id;
    private String brand;
    private String engineNumber;
    private int year; //set to 1900
    private double price; //set to 0

    public Vehicle(int id, String brand, String engineNumber, int year, double price) {
        this.id = id;
        this.brand = brand;
        this.engineNumber = engineNumber;
        this.year = year;
        this.price = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        if(this.year < 1930){ //if before 1930 set it to 1900
            this.year = 1900;
    }else if(this.year > 2020){ // if its above 2020 set it to 1900
        this.year = 1900;
        }else {
            this.year = year; //if in between set it to the input

        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //with the year setter make sure it falls between 1930-2020. if not set it to 1900

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", engineNumber='" + engineNumber + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
