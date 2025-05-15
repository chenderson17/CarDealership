import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);
    UserInterface(Dealership dealership){
        this.dealership = dealership;
    }
    public void display(){

        String menu = String.format("""
                                    Press 1 to filter Vehicles by Price Request
                                    Press 2 to filter Vehicles by Model
                                    Press 3 to filter Vehicles by Year
                                    Press 4 to filter Vehicles by Color
                                    Press 5 to filter Vehicles by Mileage
                                    Press 6 to get all Vehicles
                                    Press 7 Get Vehicle by Type
                                    Press 8 to add a Vehicle
                                    Press 9 to remove a Vehicle
                                    Press 0 to exit
                                    Your Input: 
                                    """);
        System.out.print(menu);
        String in = scanner.nextLine();
        while(!in.equals("0")){
            switch (in){
                case "1":
                    System.out.print("Enter the minimum price: ");
                    int min = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the maximum price: ");
                    int max = scanner.nextInt();
                    processGetByPriceRequest(min,max);
                    scanner.nextLine();
                    break;
                case "2":
                    System.out.print("Enter the make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter the model: ");
                    String model = scanner.nextLine();
                    processGetByMakeModelRequest(make,model);
                    break;
                case "3":
                    System.out.print("Enter the year: ");
                    String year = scanner.nextLine();
                    processGetByYearRequest(year);
                    break;
                case "4":
                    System.out.print("Enter the color: ");
                    String color = scanner.nextLine();
                    processGetByColorRequest(color);
                    break;
                case "5":
                    System.out.print("Enter the maximum number of mileage: ");
                    int mileage = Integer.valueOf(scanner.nextLine());
                    processGetByMileageRequest(mileage);
                    break;
                case "6":
                    processGetAllVehiclesRequest();
                    break;
                case "7":
                    System.out.print("Enter a vehicle type: ");
                    String vehicleType = scanner.nextLine();
                    processGetByVehicleTypeRequest(vehicleType);
                    break;
                case "8":
                    processGetAllVehiclesRequest();
                    System.out.print("Enter the index of the vehicle you want to remove: ");
                    int index = Integer.valueOf(scanner.nextLine());
                   processRemoveVehicleRequest(index);
                    break;
                default:
                    System.out.print("Sorry, I didn't understand that command.");
                    break;

            }
            System.out.print(menu);
            in = scanner.nextLine();
        }
    }
    public void processGetByPriceRequest(double min, double max){
        printResults(dealership.getVehiclesByPriceRequest(min,max));
    }
    public void processGetByMakeModelRequest(String make, String model){
        printResults(dealership.getVehiclesByMakeModelRequest(make,model));
    }
    public void processGetByYearRequest(String year){
        printResults(dealership.getVehiclesByYearRequest(Integer.valueOf(year)));
    }
    public void processGetByColorRequest(String color){
        printResults(dealership.getVehiclesByColorRequest(color));
    }
    public void processGetByMileageRequest(int mileage){
        printResults(dealership.getByMileageRequest(mileage));

    }
    public void processGetByVehicleTypeRequest(String vehicleType){
        printResults(dealership.getByVehicleTypeRequest(vehicleType));
    }
    public void processGetAllVehiclesRequest(){
        printResults(dealership.getInventory());
    }
    public void processAddVehicleRequest(){
    }
    public void processRemoveVehicleRequest(int index){
        dealership.removeVehicleRequest(index);
        printResults(dealership.getInventory());
    }
    //helper
    public void printResults(List<Vehicle> result){
        for(int index = 0; index < result.size(); index++){
            System.out.println(index + 1 + "." + result.get(index));
        }
    }
}
