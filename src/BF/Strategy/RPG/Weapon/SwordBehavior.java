package BF.Strategy.RPG.Weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Используется мечь!");
    }
}
