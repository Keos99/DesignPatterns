package GoF.Strategy.Duck.Ducks;

import GoF.Strategy.Duck.Fly.FlyNoWay;
import GoF.Strategy.Duck.Quack.Quack;

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
