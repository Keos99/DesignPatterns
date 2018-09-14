package BF.Strategy.RPG.Character;

import BF.Strategy.RPG.Weapon.KnifeBehavior;

public class King extends Character{
    public King(){
        weaponBehavior = new KnifeBehavior();
    }
}
