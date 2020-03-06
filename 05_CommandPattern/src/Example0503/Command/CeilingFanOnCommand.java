package Example0503.Command;

import Example0503.Things.CeilingFan;

public class CeilingFanOnCommand implements ICommand {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
	@Override
	public void undo() {

	}
}
