//3. Implement Context Class
public class Ex_8_PaymentContext {
    private Ex_8_PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(Ex_8_PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
