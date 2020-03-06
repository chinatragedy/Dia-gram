package Example0501.Command;

import Example0501.Things.Light;

public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void exceute() {
        light.on();
    }
}
