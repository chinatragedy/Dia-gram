package Example0502.Command;

import Example0502.Things.CeilingFan;

public class CeilingFanOnCommand implements ICommand {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}	@Override
	public void undo() {

	}
}
