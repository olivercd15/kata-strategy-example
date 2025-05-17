package edu.alenasoft.principlespatterns.patterns.StrategyExample;

public class Fly implements FlyBehavior {
    public void fly() {
        System.out.println("Vuelo con alas!!!");
    }
}
