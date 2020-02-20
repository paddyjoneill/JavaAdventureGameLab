package fighters.weapons;

import interfaces.IDamager;

public abstract class Weapon implements IDamager {

    private int damageLevel;

    public Weapon(int damageLevel) {
        this.damageLevel = damageLevel;
    }

    public int getDamageLevel() {
        return damageLevel;
    }
}
