package Example0501;

import Example0501.Command.GarageDoorOpenCommand;
import Example0501.Command.ICommand;
import Example0501.Command.LightOnCommand;
import Example0501.Command.SimpleRemoteControl;
import Example0501.Things.GarageDoor;
import Example0501.Things.Light;

public class Main0501 {
    public static void main(String args[]) {
        System.out.println("- Command Pattern Begin -\n");
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        ICommand command = new LightOnCommand(light);
        remote.setCommond(command);
        remote.buttonWasPressed();

        command = new GarageDoorOpenCommand(new GarageDoor(""));
        remote.setCommond(command);
        remote.buttonWasPressed();
    }
}
