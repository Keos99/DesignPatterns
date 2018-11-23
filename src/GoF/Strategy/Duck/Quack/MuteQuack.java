package GoF.Strategy.Duck.Quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Оно должно молчать");
    }
}
