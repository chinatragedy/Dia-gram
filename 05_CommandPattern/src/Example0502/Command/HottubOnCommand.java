package Example0502.Command;

import Example0502.Things.Hottub;

public class HottubOnCommand implements ICommand {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}	@Override
	public void undo() {

	}
}
