package fighters;
import fighters.weapons.Weapon;
import interfaces.IAttack;
import interfaces.IDamager;
import player.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IAttack {

    private ArrayList<Weapon> weapons;

    public Fighter(String name, int healthLevel) {
        super(name, healthLevel);
        this.weapons = new ArrayList<Weapon>();
    }

    public int weaponCount(){
        return this.weapons.size();
    }


    public void addWeapon(Weapon weapon){
        this.weapons.add(weapon);
    }

    public void removeWeapon(Weapon weapon) {
        this.weapons.remove(weapon);
    }

    public void attack(Player player, IDamager iDamager){
        player.reduceHealthLevel(iDamager.getDamageLevel());
    }
}
