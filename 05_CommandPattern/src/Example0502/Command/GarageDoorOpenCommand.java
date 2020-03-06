package Example0502.Command;

import Example0502.Things.GarageDoor;

public class GarageDoorOpenCommand implements ICommand {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
    @Override
    public void undo() {

    }
}
