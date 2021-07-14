package command.tmp;

/**
 * Package:command
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class LightCommand implements Command {

    Light light;

    public LightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
