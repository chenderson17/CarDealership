import java.io.*;

public class UpdateFile {
    File f = new File("inventory.csv");

    public void writeToInventory(int vin, int year, String make, String model, String vehicleType,String color, int odometer,double price) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(f,true));
            writer.newLine();
            String format = String.format("%d|%d|%s|%s|%s|%s|%d|%.2f",vin,year,make,model,vehicleType,color,odometer,price);
            writer.write(format);
            System.out.println("Vehicle Added to Inventory");
            writer.close();
        }
        catch(Exception error){
            error.printStackTrace();
        }

    }
}
