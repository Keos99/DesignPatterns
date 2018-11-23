package GoF.Strategy.RPG.Character;

import GoF.Strategy.RPG.Weapon.SwordBehavior;

public class Knight extends Character{

    public Knight () {
        weaponBehavior = new SwordBehavior();
    }
}
