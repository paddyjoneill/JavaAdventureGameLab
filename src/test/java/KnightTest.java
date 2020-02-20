import fighters.Dwarf;
import fighters.Knight;
import fighters.weapons.Axe;
import fighters.weapons.Sword;
import fighters.weapons.Weapon;
import org.junit.Before;
import org.junit.Test;
import treasures.Gems;
import treasures.Gold;
import treasures.Treasure;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Dwarf dwarf;
    private Weapon sword;
    private Weapon axe;
    private Treasure gold;
    private Treasure gems;

    @Before
    public void before(){
        knight = new Knight("Brian", 100);
        dwarf = new Dwarf("Luca", 50);
        sword = new Sword(20);
        axe = new Axe(25);
        gold = new Gold("Gold", 100);
        gems = new Gems("Diamonds", 1000);
    }

    @Test
    public void canGetKnightName(){
        assertEquals("Brian", knight.getName());
    }

    @Test
    public void canGetHealthLevel(){
        assertEquals(100, knight.getHealthLevel());
    }

    @Test
    public void canReduceHealthLevel(){
        knight.reduceHealthLevel(10);
        assertEquals(90, knight.getHealthLevel());
    }

    @Test
    public void canIncreaseHealthLevel(){
        knight.reduceHealthLevel(20);
        knight.increaseHealth(10);
        assertEquals(90, knight.getHealthLevel());
    }

    @Test
    public void startsWithNoWeapons(){
        assertEquals(0, knight.weaponCount());
    }

    @Test
    public void canAddWeapon(){
        knight.addWeapon(sword);
        assertEquals(1, knight.weaponCount());
    }

    @Test
    public void canRemoveWeapon(){
        knight.addWeapon(sword);
        knight.addWeapon(axe);
        knight.removeWeapon(axe);
        assertEquals(1, knight.weaponCount());
    }

    @Test
    public void startsWithNoTreasure(){
        assertEquals(0, knight.treasureCount());
    }

    @Test
    public void canAddTreasure(){
        knight.addTreasure(gold);
        assertEquals(1, knight.treasureCount());
    }

    @Test
    public void canRemoveTreasure(){
        knight.addTreasure(gold);
        knight.addTreasure(gems);
        knight.removeTreasure(gold);
        assertEquals(1, knight.treasureCount());
    }

    @Test
    public void canAttackPlayer(){
        knight.addWeapon(sword);
        knight.attack(dwarf, sword);
        assertEquals(30, dwarf.getHealthLevel());
    }

    @Test
    public void canAddArmour(){
        knight.addArmour(50);
        assertEquals(50, knight.getArmourLevel());
    }

    @Test
    public void armourReducedBeforeHealth(){
        knight.addArmour(30);
        knight.reduceHealthLevel(20);
        assertEquals(100, knight.getHealthLevel());
        assertEquals(10, knight.getArmourLevel());
        knight.reduceHealthLevel(20);
        assertEquals(0, knight.getArmourLevel());
        assertEquals(90, knight.getHealthLevel());
    }

}
