package GoF.Strategy.Duck.Quack;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Вообщем я пищу!");
    }
}
