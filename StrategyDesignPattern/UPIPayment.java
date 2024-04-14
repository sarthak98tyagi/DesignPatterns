public class UPIPayment implements PaymentMode{
    @Override
    public void processPayment() {
        //execute Payment using UPI gateway
        System.out.println("UPI Payment Initiated");
    }
}