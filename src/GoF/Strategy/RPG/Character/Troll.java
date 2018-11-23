package GoF.Strategy.RPG.Character;

import GoF.Strategy.RPG.Weapon.AxeBehavior;

public class Troll extends Character {

    public Troll () {
        weaponBehavior = new AxeBehavior();
    }
}
