package BF.Strategy.RPG.Character;

import BF.Strategy.RPG.Weapon.BowBehavior;

public class Queen extends Character {

    public Queen () {
        weaponBehavior = new BowBehavior();
    }
}
