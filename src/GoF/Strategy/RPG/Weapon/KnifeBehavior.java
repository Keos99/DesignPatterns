package GoF.Strategy.RPG.Weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Используется нож!");
    }
}
