package BF.Strategy.Duck.Ducks;

import BF.Strategy.Duck.Fly.FlyWithWings;
import BF.Strategy.Duck.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am Mallard Duck!");
    }
}
