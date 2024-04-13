public class NetBankingPayment implements PaymentMode{
    @Override
    public void processPayment() {
        //execute Payment using UPI gateway
        System.out.println("Net Banking Payment Initiated");
    }

}
