package conform_model;

import police_duck_design.Duck;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createDuckCallDuck() {
        return new DuckCall();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
