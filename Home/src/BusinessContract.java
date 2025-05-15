import java.util.Date;
//Instances directly only of its Descendents
abstract class BusinessContract {
    private Date date;
    private String customerName;
    private String customerEmail;
    private boolean isSold;
    private double totalPrice;
    private double monthlyPayment;
    BusinessContract(
            Date date,
            String customerName,
            String customerEmail,
            boolean isSold,
            double totalPrice,
            double monthlyPayment
    ){
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.isSold = isSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;

    }
}
