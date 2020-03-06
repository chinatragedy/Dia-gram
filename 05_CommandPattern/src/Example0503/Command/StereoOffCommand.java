package Example0503.Command;

import Example0503.Things.Stereo;

public class StereoOffCommand implements ICommand {
	Stereo stereo;
 
	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}
 
	public void execute() {
		stereo.off();
	}

	@Override
	public void undo() {

	}
}
