package magicians.spells;

import interfaces.IDamager;

public abstract class Spell implements IDamager {

    private String spellName;
    private int damageLevel;

    public Spell(String spellName, int damageLevel) {
        this.spellName = spellName;
        this.damageLevel = damageLevel;
    }

    public int getDamageLevel() {
        return damageLevel;
    }
}
