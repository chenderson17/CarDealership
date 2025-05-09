public class Vehicle {
    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double price;
    Vehicle(int vin, int year, String make, String model, String vehicleType,String color, int odometer,double price){
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }
    //Getter methods
    public int getVin(){
        return vin;
    }
    public int year(){
        return year;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getVehicleType(){
        return vehicleType;
    }
    public String getColor(){
        return color;
    }
    public int getOdometer(){
        return odometer;
    }
    public double getPrice(){
        return price;
    }
    //setter methods
    public void setVin(int vin){
        this.vin = vin;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }
    public void setOdometer(int odometer){
        this.odometer = odometer;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    @Override
    public String toString(){
        return String.format("Vin:%d|Year:%d|Make:%s|Model:%s|Vehicle Type:%s|Color:%s|Odometer:%d|Price:$%.2f",vin,year,make,model,vehicleType,color,odometer,price);
    }

}
