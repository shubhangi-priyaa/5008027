public class Ex_8_PayPalPayment implements Ex_8_PaymentStrategy {
    private String email;

    public Ex_8_PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account: " + email);
    }
}
