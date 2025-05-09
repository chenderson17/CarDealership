import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager {
    File file;
    DealershipFileManager(File file){
        this.file = file;
    }
    //parse file

    public Dealership getDealership() throws IOException {
        //create dealership
        Scanner reader = new Scanner(file);
        String data = reader.nextLine();
        String[] parts = parse(data);
        Dealership dealership = new Dealership(parts[0],parts[1],parts[2]);
        //change inventory
        ArrayList<Vehicle> inventory = new ArrayList<>();
        while(reader.hasNextLine()){
            parts = parse(reader.nextLine());
            inventory.add(new Vehicle(Integer.parseInt(parts[0]),Integer.parseInt(parts[1]),parts[2],parts[3],parts[4],parts[5],Integer.parseInt(parts[6]),Double.parseDouble(parts[7])));
        }
        dealership.changeInventory(inventory);
        return dealership;
    }
    //helper methods;
    public String[] parse(String parse){
        return parse.split("\\|");
    }

    public static void main(String[] args) throws IOException {
        DealershipFileManager fileManager = new DealershipFileManager(new File("Inventory.csv"));
        Dealership usedCars = fileManager.getDealership();
        for(Vehicle vehicle : usedCars.getInventory()){
            System.out.println(vehicle.toString());
        }

    }

}
