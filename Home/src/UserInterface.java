import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);
    UserInterface(){

    }
    public void display(){
        String menu = String.format("""
                                    Press 1 to filter Vehicles by Price Request
                                    Press 2 to filter Vehicles by Model
                                    Press 3 to filter Vehicles by Year
                                    Press 4 to filter Vehicles by Color
                                    Press 5 to filter Vehicles by Mileage
                                    Press 6 to get all Vehicles
                                    Your Input: 
                                    """);
    }
    public void processGetByPriceRequest(){

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
