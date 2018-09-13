package BF.Strategy.Ducks;

import BF.Strategy.Fly.FlyBehavior;
import BF.Strategy.Quack.QuackBehavior;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){}

    public abstract void display();

    public void setFlyBehavior (FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior (QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void swim(){
        System.out.println("All can swim!");
    }
}
