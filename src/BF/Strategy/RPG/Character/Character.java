package BF.Strategy.RPG.Character;

import BF.Strategy.RPG.Weapon.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weaponBehavior;

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight(){
        weaponBehavior.useWeapon();
    }

}
