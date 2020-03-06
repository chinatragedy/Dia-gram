package Example0503.Command;

import Example0503.Things.Light;

public class LivingroomLightOffCommand implements ICommand {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
	@Override
	public void undo() {

	}
}
