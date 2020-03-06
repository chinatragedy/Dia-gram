package Example0503.Command;

import Example0503.Things.Light;

public class LivingroomLightOnCommand implements ICommand {
	Light light;

	public LivingroomLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
	@Override
	public void undo() {

	}
}
