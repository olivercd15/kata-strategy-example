package edu.alenasoft.principlespatterns.patterns.StrategyExample;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Hago Squeak!!!");
    }
}
