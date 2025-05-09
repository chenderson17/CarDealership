import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DealershipFileManager {
    File file;
    DealershipFileManager(File file){
        this.file = file;
    }
    //parse file

    public Dealership getDealerShip() throws IOException {
        Scanner reader = new Scanner(file);
        Dealership dealership;
        return dealership;
    }

    public static void main(String[] args) throws IOException {
        DealershipFileManager fileManager = new DealershipFileManager(new File("Inventory.csv"));
        fileManager.getDealerShip();
    }
}
