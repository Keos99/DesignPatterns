package GoF.Strategy.RPG;

import GoF.Strategy.RPG.Character.King;
import GoF.Strategy.RPG.Character.Knight;
import GoF.Strategy.RPG.Character.Queen;
import GoF.Strategy.RPG.Character.Troll;

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
