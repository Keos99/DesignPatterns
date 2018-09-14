package BF.Strategy.RPG;

import BF.Strategy.RPG.Character.King;
import BF.Strategy.RPG.Character.Knight;

public class MiniRPG {
    public static void main(String[] args) {
        Knight knight = new Knight();
        knight.fight();

        King king = new King();
        king.fight();
    }
}
