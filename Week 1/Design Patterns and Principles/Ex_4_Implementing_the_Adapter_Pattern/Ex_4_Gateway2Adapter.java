public class Ex_4_Gateway2Adapter implements Ex_4_PaymentProcessor {
    private Ex_4_Gateway2 gateway2;

    public Ex_4_Gateway2Adapter(Ex_4_Gateway2 gateway2) {
        this.gateway2 = gateway2;
    }

    @Override
    public void processPayment(double amount) {
        gateway2.executePayment(amount);
    }
}
