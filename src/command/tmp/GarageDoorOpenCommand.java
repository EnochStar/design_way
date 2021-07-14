package command.tmp;

/**
 * Package:command
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class GarageDoorOpenCommand implements Command{
    GarageDoorOpen garageDoorOpen;

    public GarageDoorOpenCommand(GarageDoorOpen garageDoorOpen) {
        this.garageDoorOpen = garageDoorOpen;
    }

    @Override
    public void execute() {
        garageDoorOpen.up();
    }
}
