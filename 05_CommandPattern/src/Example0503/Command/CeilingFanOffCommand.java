package Example0503.Command;

import Example0503.Things.CeilingFan;

public class CeilingFanOffCommand implements ICommand {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }

    @Override
    public void undo() {

    }
}
