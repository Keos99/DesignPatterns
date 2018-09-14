package BF.Strategy.RPG.Character;

import BF.Strategy.RPG.Weapon.SwordBehavior;

public class Knight extends Character{

    public Knight () {
        weaponBehavior = new SwordBehavior();
    }
}
