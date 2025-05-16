public class SalesContract {
    final double taxAmount = 0.05;
    final double recordingFee = 100.00;
    double processingFee;
    Boolean willFiance;
    double monthlyPayment;
    SalesContract(boolean willFiance, double vehiclePrice){
        processingFee = vehiclePrice < 10000 ? 295 : 495;
        this.willFiance = willFiance;
        if(willFiance){
            monthlyPayment = vehiclePrice > 10000 ? (vehiclePrice * (4.25/100.00)) * 48: (5.25/100) * 24;
        }
    }

}
