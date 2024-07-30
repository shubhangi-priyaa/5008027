//2. Implement Concrete Commands
public class Ex_9_LightOnCommand implements Ex_9_Command {
    private Ex_9_Light light;

    public Ex_9_LightOnCommand(Ex_9_Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
