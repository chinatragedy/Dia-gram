package Example0501.Command;

import Example0501.Things.GarageDoor;

public class GarageDoorOpenCommand implements ICommand {
    GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void exceute() {
        door.up();
    }
}
