import enemies.Goblin;
import magicians.Wizard;
import magicians.spells.Fireball;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoblinTest {

    private Goblin goblin;
    private Wizard wizard;
    private Fireball fireball;

    @Before
    public void before(){
        goblin = new Goblin("Bill", 50);
        wizard = new Wizard("bob", 100);
        fireball = new Fireball("fireball", 25);
        wizard.addSpell(fireball);
    }

    @Test
    public void canGetHealthLevel(){
        assertEquals(50, goblin.getHealthLevel());
    }

    @Test
    public void canReduceHealthByAttack(){
        wizard.attack(goblin, fireball);
        assertEquals(25, goblin.getHealthLevel());
    }

    @Test
    public void goblinCanBeKilled(){
        wizard.attack(goblin, fireball);
        wizard.attack(goblin, fireball);
        assertEquals(0, goblin.getHealthLevel());
    }

}
