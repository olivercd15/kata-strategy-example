package edu.alenasoft.principlespatterns.patterns.StrategyExample;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un pato de goma (Rubber)");
    }

}
