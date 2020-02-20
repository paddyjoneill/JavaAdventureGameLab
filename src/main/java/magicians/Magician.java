package magicians;

import magicians.creatures.Creature;
import player.Player;

public abstract class Magician extends Player {

    private Creature creature;

    public Magician(String name, int healthLevel) {
        super(name, healthLevel);
        this.creature = null;
    }
}
