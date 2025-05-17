package edu.alenasoft.principlespatterns.patterns.StrategyExample;

public class MallardDuck extends Duck {
    public MallardDuck() {
//        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un pato silvestre (Mallard)");
    }
}
