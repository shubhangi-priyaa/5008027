//2. Implement Concrete Strategies
public class Ex_8_CreditCardPayment implements Ex_8_PaymentStrategy {
    private String cardNumber;

    public Ex_8_CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card: " + cardNumber);
    }
}

