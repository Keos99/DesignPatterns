package GoF.Strategy.Duck.Fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am fly!");
    }
}
