package Example0501.Command;

public class SimpleRemoteControl {
    ICommand slot;

    public void setCommond(ICommand commond) {
        slot = commond;
    }


    public void buttonWasPressed() {
        slot.exceute();
    }
}
