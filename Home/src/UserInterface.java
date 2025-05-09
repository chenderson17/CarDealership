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
                                    Press 7 to remove a Vehicle
                                    Press 0 to exit
                                    Your Input: 
                                    """);
        System.out.println(menu);
        String in = scanner.nextLine();
        while(!in.equals("0")){
            switch (in){
                case "1":
                    System.out.print("Enter the minimum price: ");
                    int min = scanner.nextInt();
                    scanner.nextLine();
                    System.out.printf("Enter the maximum price: ");
                    int max = scanner.nextInt();
                    processGetByPriceRequest(min,max);
                    scanner.nextLine();
                    break;
            }
            System.out.print(menu);
            in = scanner.nextLine();
        }
    }
    public void processGetByPriceRequest(double min, double max){
        List<Vehicle> result = dealership.getVehiclesByPriceRequest(min,max);
        for(int index = 0; index < result.size(); index++){
            System.out.println(index + 1 + "." + result.get(index));
        }

    }
    public void processGetByMakeModelRequest(){

    }
    public void processGetByYearRequest(){

    }
    public void processGetByColorRequest(){

    }
    public void processGetByMileageRequest(){

    }
    public void processGetByVehicleTypeRequest(){

    }
    public void processGetAllVehiclesRequest(){

    }
    public void processAddVehicleRequest(){

    }
    public void processRemoveVehicleRequest(){

    }
}
