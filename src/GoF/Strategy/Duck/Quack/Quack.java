package GoF.Strategy.Duck.Quack;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Кря! Кря! Кря!");
    }
}
