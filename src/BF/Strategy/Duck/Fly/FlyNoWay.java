package BF.Strategy.Duck.Fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не умею летать!");
    }
}
