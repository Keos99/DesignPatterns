package BF.Strategy.Ducks;

import BF.Strategy.Fly.FlyWithWings;
import BF.Strategy.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am Mallard Duck!");
    }
}
