package Example0503.Command;

public class SimpleRemoteControl {
    ICommand slot;

    public void setCommond(ICommand commond) {
        slot = commond;
    }


    public void buttonWasPressed() {
        slot.execute();
    }
}
