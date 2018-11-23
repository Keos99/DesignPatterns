package GoF.Strategy.RPG.Weapon;

public class BowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Используется Лук!!!");
    }
}
