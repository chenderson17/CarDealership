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
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle : inventory){
            if(vehicle.getPrice() >= min && vehicle.getPrice() <= max ){
                result.add(vehicle);
            }
        }
        return result;
    }

    public List<Vehicle> getVehiclesByMakeModelRequest(String make, String model){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle vehicle: inventory){
            if(vehicle.getMake().equalsIgnoreCase(make) && !make.isEmpty() || vehicle.getModel().equalsIgnoreCase(model) && !model.isEmpty()){
                result.add(vehicle);
            }
        }
        return result;
    }
    public List<Vehicle> getVehiclesByYearRequest(int min){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle v : inventory){
            if(v.year() == min){
                result.add(v);
            }

        }
        return result;
    }
    public List<Vehicle> getVehiclesByColorRequest(String color){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle v : inventory){
            if(v.getColor().equalsIgnoreCase(color)){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> getByMileageRequest(int max){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle v: inventory){
            if(v.getOdometer() <= max){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> getByVehicleTypeRequest(String type){
        List<Vehicle> result = new ArrayList<>();
        for(Vehicle v : inventory){
            if(v.getVehicleType().equalsIgnoreCase(type)){
                result.add(v);
            }
        }
        return result;
    }
    public List<Vehicle> addVehicleRequest(int vin, int year, String make, String model, String vehicleType,String color, int odometer,double price){
        inventory.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
        return inventory;
    }
    public List<Vehicle> removeVehicleRequest(int index){
        inventory.remove(index - 1);
        return inventory;
    }

}
