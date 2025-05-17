package edu.alenasoft.principlespatterns;

import edu.alenasoft.principlespatterns.patterns.StrategyExample.*;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.quack();
        redheadDuck.display();
        redheadDuck.fly();
        rubberDuck.display();
        rubberDuck.fly();
        decoyDuck.display();
    }
}