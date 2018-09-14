package BF.Strategy.Duck.Ducks;

import BF.Strategy.Duck.Fly.FlyNoWay;
import BF.Strategy.Duck.Quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Model duck");
    }
}
