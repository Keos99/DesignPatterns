package GoF.Strategy.Duck;

import GoF.Strategy.Duck.Ducks.MallardDuck;
import GoF.Strategy.Duck.Ducks.ModelDuck;
import GoF.Strategy.Duck.Fly.FlyRocketPowered;

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
