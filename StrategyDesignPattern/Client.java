import java.util.Scanner;

public class Client {

    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();
        Scanner sc = new Scanner(System.in);
        String paymentType = sc.nextLine();
        switch (paymentType){
            case "UPI":
                paymentService.setPaymentMode(new UPIPayment());
                break;
            case "Credit Card":
                paymentService.setPaymentMode(new CreditCardPayment());
                break;
            case "Debit Card":
                paymentService.setPaymentMode(new DebitCardPayment());
                break;
            case "Net Banking":
                paymentService.setPaymentMode(new NetBankingPayment());
                break;
            default:
                System.out.println("Payment Mode not supported");
                return;
        }
        paymentService.execute();
    }
}
