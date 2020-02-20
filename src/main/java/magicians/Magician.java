package magicians;

import interfaces.IDamager;
import magicians.creatures.Creature;
import magicians.spells.Fireball;
import magicians.spells.Spell;
import player.Player;

import java.util.ArrayList;

public abstract class Magician extends Player {

    private ArrayList<Creature> creatures;
    private ArrayList<Spell> spells;

    public Magician(String name, int healthLevel) {
        super(name, healthLevel);
        this.creatures = new ArrayList<Creature>();
        this.spells = new ArrayList<Spell>();
    }

    public int creatureCount() {
        return this.creatures.size();
    }

    public void addCreature(Creature creature){
        this.creatures.add(creature);
    }

    public void removeCreature(Creature creature){
        this.creatures.remove(creature);
    }

    public int spellCount() {
       return  this.spells.size();
    }

    public void addSpell(Spell spell) {
        this.spells.add(spell);
    }

    public void removeSpell(Spell spell) {
        this.spells.remove(spell);
    }

    public void attack(Player player, IDamager iDamager){
        player.reduceHealthLevel(iDamager.getDamageLevel());
    }
}
