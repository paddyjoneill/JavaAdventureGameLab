package fighters;
import fighters.weapons.Weapon;
import player.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player {

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
}
