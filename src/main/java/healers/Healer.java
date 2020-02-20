package healers;

import healers.potions.Potion;
import player.Player;

import java.util.ArrayList;

public abstract class Healer extends Player {

    private ArrayList<Potion> potions;

    public Healer(String name, int healthLevel) {
        super(name, healthLevel);
        this.potions = new ArrayList<Potion>();
    }
}
