package Example0503;

import Example0503.Command.ICommand;
import Example0503.Command.NoCommand;

public class RemoteControl {
    ICommand[] onCommands;
    ICommand[] offCommands;
    ICommand undoCommond;

    public RemoteControl() {
        onCommands = new ICommand[7];
        offCommands = new ICommand[7];

        ICommand noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommond = noCommand;
    }

    public void setCommand(int slot, ICommand onCommand, ICommand offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommond = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommond = offCommands[slot];
    }

    public void undoButtonWasPushed()
    {
        undoCommond.undo();
        undoCommond = new NoCommand();
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
