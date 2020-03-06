package Example0502.Command;

import Example0502.Things.GarageDoor;

public class GarageDoorUpCommand implements ICommand {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}	@Override
	public void undo() {

	}
}
