package BF.Strategy.RPG.Character;

import BF.Strategy.RPG.Weapon.AxeBehavior;

public class Troll extends Character {

    public Troll () {
        weaponBehavior = new AxeBehavior();
    }
}
