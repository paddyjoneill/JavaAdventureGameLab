package magicians.spells;

public abstract class Spell {

    private String spellName;
    private int damageValue;

    public Spell(String spellName, int damageValue) {
        this.spellName = spellName;
        this.damageValue = damageValue;
    }
}
