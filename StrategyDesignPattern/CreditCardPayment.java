public class CreditCardPayment implements PaymentMode{
    @Override
    public void processPayment() {
        //execute Payment using Credit Card Details
        System.out.println("Credit Card Payment Initiated");
    }

}
