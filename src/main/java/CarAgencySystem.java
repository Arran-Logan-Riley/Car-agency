import java.util.Arrays;
import java.util.Scanner;

public class CarAgencySystem {
    public static void main(String[] args) {
        System.out.println("test");
        CarAgency carAgency = new CarAgency("A name");

        CompactCar honda_civic = new CompactCar(1,"Honda Civic","J35A3-USDM-SOHC-VTEC",2018,27500,4); //init all the cars
        LuxuryCar Mercedes_Benz = new LuxuryCar(2,"Mercedes-Benz","52WVC10338",2019, 108100,5);
        Wagon audi_a4 = new Wagon(3,"Audi A4 Allroad Quattro","N55B30T0",2018,45475,4);
        Truck maxi_van = new Truck(4,"Maxi Van","12AXV-C10YUY", 2007,10100,10,4);


    //carAgency.listOfCars.addAll(Arrays.asList(honda_civic,Mercedes_Benz,audi_a4,maxi_van)); //add all the cars to the list
        //add the cars to the car agency
        carAgency.add(honda_civic);
        carAgency.add(Mercedes_Benz);
        carAgency.add(audi_a4);
        carAgency.add(maxi_van);

        Scanner myObj  = new Scanner(System.in); //init the scanner
        System.out.println("Welcome to the Car Agency. Please pick from the following options:/n" + //User guid:
                "1. Show all existing car records in the database (in any order).\n" +
                "2. Add a new car record to the database\n" +
                "3. Exit program.\n" +
                "--------------------------\n" +
                "What would you like to do?:");


        String userInput = myObj.nextLine();

        if(userInput.equals("1")){ //display a car with the user putting in a identifier (e.g Wagon or Truck). this will bring up all objects with that identifier.
            System.out.println("Display information of all cars:");
            String userInputType = myObj.nextLine();
            System.out.println(carAgency.display(userInput));
        }else if(userInput.equals("2")){
            System.out.println("enter a new car:\n" +
                    "Type:");
            String type = myObj.nextLine();
            System.out.println("Brand: ");
            String brand = myObj.nextLine();
            System.out.println("EnginNumber: ");
            String EnginNumber = myObj.nextLine();
            System.out.println("year: ");
            String year = myObj.nextLine();
            System.out.println("price: ");
            String price = myObj.nextLine();

            int numberOfcars = carAgency.getNumberOfCars(); //get the number of cars from car agency

            //Does not work as i cannot get the length of the car agency array.
            //The truck requires differnt inputs as it has thigns like axills and load. This would be done through a nested if statment below checking if it is a truck. I ran out of time.
            if(type == "CompactCar"){
                CompactCar car = new CompactCar(numberOfcars,type,EnginNumber,year,price,numberOfcars);
                System.out.println(type + " Has been added");
                carAgency.add(car);
            }else if(type.equals("LuxuryCar")){
                LuxuryCar car = new LuxuryCar(numberOfcars,type,EnginNumber,year,price,numberOfcars);
                System.out.println(type + " Has been added");
                carAgency.add(car);
            }else if(type.equals("Wagon")){
                Wagon car = new Wagon(numberOfcars,type,EnginNumber,year,price,numberOfcars);
                System.out.println(type + " Has been added");
                carAgency.add(car);
            }else if(type.equals("Truck")){
                Truck car = new Truck(numberOfcars,type,EnginNumber,year,price,numberOfcars);
                carAgency.add(car);
                System.out.println(type + " Has been added");
            }

        }else if(userInput.equals("3")){ //if the user types 3 the program will exit.
            System.exit(0);
        }

        /* the code does not work, but with a bit of bug fixing,
        it should be able to run fine. I hope i did well, thanks.
         */

    }
}
