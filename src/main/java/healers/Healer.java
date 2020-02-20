package healers;

import healers.potions.Potion;
import interfaces.IHeal;
import player.Player;

import java.util.ArrayList;

public abstract class Healer extends Player implements IHeal {

    private ArrayList<Potion> potions;

    public Healer(String name, int healthLevel) {
        super(name, healthLevel);
        this.potions = new ArrayList<Potion>();
    }

    public void heal(Player player, Potion potion){
        player.increaseHealth(potion.getRestoreValue());
    }

    public int potionCount() {
        return this.potions.size();
    }

    public void addPotion(Potion potion) {
        this.potions.add(potion);
    }

    public void removePotion(Potion potion){
        this.potions.remove(potion);
    }
}
