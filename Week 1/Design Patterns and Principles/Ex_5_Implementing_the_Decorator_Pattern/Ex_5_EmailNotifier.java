//2. Implement Concrete Component
public class Ex_5_EmailNotifier implements Ex_5_Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending email with message: " + message);
    }
}
