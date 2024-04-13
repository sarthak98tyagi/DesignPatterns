public class DebitCardPayment implements PaymentMode{
    @Override
    public void processPayment() {
        //execute Payment using UPI gateway
        System.out.println("Debit Card Payment Initiated");
    }

}
