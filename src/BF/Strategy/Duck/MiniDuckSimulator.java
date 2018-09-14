package BF.Strategy.Duck;

import BF.Strategy.Duck.Ducks.MallardDuck;
import BF.Strategy.Duck.Ducks.ModelDuck;
import BF.Strategy.Duck.Fly.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
