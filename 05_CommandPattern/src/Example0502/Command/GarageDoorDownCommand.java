package Example0502.Command;

import Example0502.Things.GarageDoor;

public class GarageDoorDownCommand implements ICommand {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}	@Override
	public void undo() {

	}
}
