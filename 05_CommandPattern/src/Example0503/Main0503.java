package Example0503;

import Example0503.Command.*;
import Example0503.Things.*;

public class Main0503 {
    public static void main(String args[]) {
        System.out.println("- Command Pattern Begin -\n");
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();


        LightOnCommand LightOn = new LightOnCommand(light);
        LightOffCommand LightOff = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        ICommand[] partyOn = {LightOn, stereoOn, tvOn, hottubOn};
        ICommand[] partyOff = {LightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);


        System.out.println(remoteControl);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.onButtonWasPushed(0);

        remoteControl.undoButtonWasPushed();

//        remoteControl.offButtonWasPushed(0);
    }
}
