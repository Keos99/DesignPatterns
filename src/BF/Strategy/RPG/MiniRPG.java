package BF.Strategy.RPG;

import BF.Strategy.RPG.Character.King;
import BF.Strategy.RPG.Character.Knight;
import BF.Strategy.RPG.Character.Queen;
import BF.Strategy.RPG.Character.Troll;

public class MiniRPG {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.fight();

        King king = new King();
        king.fight();

        Queen queen = new Queen();
        queen.fight();

        Troll troll = new Troll();
        troll.fight();
    }
}
