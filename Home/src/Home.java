import java.io.File;
import java.io.IOException;

public class Home {
    public static void main(String[] args) throws IOException {
        DealershipFileManager fileManager = new DealershipFileManager(new File("inventory.csv"));
        Dealership d = fileManager.getDealership();
        UserInterface ui = new UserInterface(d);
        ui.display();
    }
}
