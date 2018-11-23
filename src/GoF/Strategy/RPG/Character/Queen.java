package GoF.Strategy.RPG.Character;

import GoF.Strategy.RPG.Weapon.BowBehavior;

public class Queen extends Character {

    public Queen () {
        weaponBehavior = new BowBehavior();
    }
}
