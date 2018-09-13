package BF.Strategy.Fly;

import BF.Strategy.Fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am fly!");
    }
}
