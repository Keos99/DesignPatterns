package GoF.Strategy.RPG.Character;

import GoF.Strategy.RPG.Weapon.KnifeBehavior;

public class King extends Character{

    public King(){
        weaponBehavior = new KnifeBehavior();
    }
}
