package conform_model;

import police_duck_design.Duck;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createDuckCallDuck() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
