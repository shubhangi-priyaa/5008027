public class Ex_4_Gateway1Adapter implements Ex_4_PaymentProcessor {
    private Ex_4_Gateway1 gateway1;

    public Ex_4_Gateway1Adapter(Ex_4_Gateway1 gateway1) {
        this.gateway1 = gateway1;
    }

    @Override
    public void processPayment(double amount) {
        gateway1.makePayment(amount);
    }
}
