package conform_model;

import police_duck_design.Duck;

/**
 * Package:conform_model
 * Description:
 *
 * @author:鲍嘉鑫
 */
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
        duckSimulator.simulate(abstractDuckFactory);
    }
    void simulate(AbstractDuckFactory abstractDuckFactory) {
        Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCallDuck();
        Quackable redHead = abstractDuckFactory.createRubberDuck();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable goose = new GooseAdapter(new Goose());
        Flock flock = new Flock();
        flock.add(mallardDuck);
        flock.add(duckCall);
        flock.add(redHead);
        flock.add(rubberDuck);
        flock.registryObserver(new QuackLogist());
        simulate(goose);
        simulate(flock);
        System.out.println("The Duck quack " + QuackCounter.getCounter() + " times");
    }

    void simulate(Quackable q) {
        q.quack();
    }
}
