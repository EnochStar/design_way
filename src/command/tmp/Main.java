package command.tmp;

/**
 * Package:command
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl src = new SimpleRemoteControl();
        Light light = new Light();
        Command lc = new LightCommand(light);
        src.setCommand(lc);
        src.button();

        GarageDoorOpen garageDoorOpen = new GarageDoorOpen();
        Command gdo = new GarageDoorOpenCommand(garageDoorOpen);
        gdo.execute();
    }
}
