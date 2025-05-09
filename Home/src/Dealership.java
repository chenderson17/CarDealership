import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory = new ArrayList<>();
    Dealership(String name, String address, String phone){
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String phone(){
        return phone;
    }

    public ArrayList<Vehicle> getInventory(){
        return inventory;
    }

    //Setter methods
    public void changeName(String name){
        this.name = name;
    }
    public void changeAddress(String address){
        this.address = address;
    }
    public void changePhone(String phone){
        this.phone = phone;
    }
    public void changeInventory(ArrayList<Vehicle> inventory){
        this.inventory = inventory;
    }

    //Search Methods
    public List<Vehicle> getVehiclesByPriceRequest(double min, double max){
        List<Vehicle> priceRequestResult = new ArrayList<>();
        for(Vehicle vehicle : inventory){
            if(vehicle.getPrice() >= min && vehicle.getPrice() <= max ){
                priceRequestResult.add(vehicle);
            }
        }
        return priceRequestResult;
    }
    /*
    public List<Vehicle> getVehiclesByMakeModelRequest(String make, String model){

    }
    public List<Vehicle> getVehiclesByYearRequest(int min,int max){

    }
    public List<Vehicle> getVehiclesByColorRequest(String color){

    }
    public List<Vehicle> getByMileageRequest(){

    }
    public List<Vehicle> getByVehicleTypeRequest(){

    }
    public List<Vehicle> addVehicleRequest(){

    }
    public List<Vehicle> removeVehicleReuqest(){

    }
     */
}
