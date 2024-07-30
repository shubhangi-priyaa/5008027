//3. Implement Decorator Classes
public abstract class Ex_5_NotifierDecorator implements Ex_5_Notifier {
    protected Ex_5_Notifier decoratedNotifier;

    public Ex_5_NotifierDecorator(Ex_5_Notifier decoratedNotifier) {
        this.decoratedNotifier = decoratedNotifier;
    }

    @Override
    public void send(String message) {
        decoratedNotifier.send(message);
    }
}
