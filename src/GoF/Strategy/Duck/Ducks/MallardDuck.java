package GoF.Strategy.Duck.Ducks;

import GoF.Strategy.Duck.Fly.FlyWithWings;
import GoF.Strategy.Duck.Quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I am Mallard Duck!");
    }
}
