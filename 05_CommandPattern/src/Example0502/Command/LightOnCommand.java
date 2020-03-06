package Example0502.Command;

import Example0502.Things.Light;

public class LightOnCommand implements ICommand {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }	@Override
    public void undo() {

    }
}
