//4. Test the Strategy Implementation
public class Ex_8_TestStrategyPattern {
    public static void main(String[] args) {
        Ex_8_PaymentContext paymentContext = new Ex_8_PaymentContext();

        
        Ex_8_PaymentStrategy creditCardPayment = new Ex_8_CreditCardPayment("1234-5678-9876-5432");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(100.00);

       
        Ex_8_PaymentStrategy payPalPayment = new Ex_8_PayPalPayment("user@example.com");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(200.00);
    }
}
