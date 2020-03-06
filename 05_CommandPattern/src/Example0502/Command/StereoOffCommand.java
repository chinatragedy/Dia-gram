package Example0502.Command;

import Example0502.Things.Stereo;

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
