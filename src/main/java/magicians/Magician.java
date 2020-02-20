package magicians;

import magicians.creatures.Creature;
import magicians.spells.Spell;
import player.Player;

import java.util.ArrayList;

public abstract class Magician extends Player {

    private Creature creature;
    private ArrayList<Spell> spells;

    public Magician(String name, int healthLevel) {
        super(name, healthLevel);
        this.creature = null;
        this.spells = new ArrayList<Spell>();
    }
}
