//5.Test the Command Implementation
public class Ex_9_TestCommandPattern {
    public static void main(String[] args) {
        Ex_9_Light livingRoomLight = new Ex_9_Light();

        Ex_9_Command lightOn = new Ex_9_LightOnCommand(livingRoomLight);
        Ex_9_Command lightOff = new Ex_9_LightOffCommand(livingRoomLight);

        Ex_9_RemoteControl remote = new Ex_9_RemoteControl();

        // Turn the light on
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn the light off
        remote.setCommand(lightOff);
        remote.pressButton();
    }
}

