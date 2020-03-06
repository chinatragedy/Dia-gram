package Example0502.Command;

import Example0502.Things.Light;

public class LightOffCommand implements ICommand {
	Light light;
 
	public LightOffCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
	@Override
	public void undo() {

	}
}
