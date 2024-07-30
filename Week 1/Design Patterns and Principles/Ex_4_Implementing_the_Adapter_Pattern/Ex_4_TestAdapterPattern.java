public class Ex_4_TestAdapterPattern {

    public static void main(String[] args) {
        Ex_4_Gateway1 gateway1 = new Ex_4_Gateway1();
        Ex_4_Gateway2 gateway2 = new Ex_4_Gateway2();

        Ex_4_PaymentProcessor adapter1 = new Ex_4_Gateway1Adapter(gateway1);
        Ex_4_PaymentProcessor adapter2 = new Ex_4_Gateway2Adapter(gateway2);

        // Test payments with different gateways
        adapter1.processPayment(100.00);
        adapter2.processPayment(200.00);
    }
}
