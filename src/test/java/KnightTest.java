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
    private Weapon sword;
    private Weapon axe;
    private Treasure gold;
    private Treasure gems;

    @Before
    public void before(){
        knight = new Knight("Brian", 100);
        sword = new Sword();
        axe = new Axe();
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
}
