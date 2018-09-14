package BF.Strategy.Duck.Fly;

public class FlyRocketPowered implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I am duck with Rocket POWER!!! ");
    }
}
