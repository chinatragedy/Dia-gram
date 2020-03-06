package Example0503.Command;

import Example0503.Things.Light;

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
