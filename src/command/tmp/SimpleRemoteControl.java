package command.tmp;

/**
 * Package:command
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void button() {
        command.execute();
    }
}
