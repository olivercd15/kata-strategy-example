package edu.alenasoft.principlespatterns.patterns.StrategyExample;

public class RedheadDuck extends Duck  {
    public RedheadDuck() {
        flyBehavior = new Fly();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("Soy un pato rojo (Redhead)");
    }
}
