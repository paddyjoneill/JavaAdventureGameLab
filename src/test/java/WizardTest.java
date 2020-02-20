import enemies.Goblin;
import magicians.Warlock;
import magicians.Wizard;
import magicians.creatures.Creature;
import magicians.creatures.Dog;
import magicians.creatures.Dragon;
import magicians.spells.Fireball;
import magicians.spells.LightningStrike;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class WizardTest {

    private Wizard wizard;
    private Dog dog;
    private Dragon dragon;
    private Fireball fireball;
    private LightningStrike lightningStrike;
    private Goblin goblin;

    @Before
    public void before(){
        wizard = new Wizard("Steve", 150);
        dog = new Dog();
        dragon = new Dragon();
        fireball = new Fireball("fireball", 20);
        lightningStrike = new LightningStrike("lightning strike", 30);
        goblin = new Goblin("Stephen", 50);
    }

    @Test
    public void canGetName(){
        assertEquals("Steve", wizard.getName());
    }

    @Test
    public void canGetHealthLevel(){
        assertEquals(150, wizard.getHealthLevel());
    }

    @Test
    public void canAddAndRemoveCreatures(){
        assertEquals(0, wizard.creatureCount());
        wizard.addCreature(dog);
        assertEquals(1, wizard.creatureCount());
        wizard.removeCreature(dog);
        assertEquals(0, wizard.creatureCount());
    }

    @Test
    public void canAddAndRemoveSpells(){
        assertEquals(0, wizard.spellCount());
        wizard.addSpell(fireball);
        assertEquals(1, wizard.spellCount());
        wizard.removeSpell(fireball);
        assertEquals(0, wizard.spellCount());
    }

    @Test
    public void canIncreaseAndDecreaseHealthLevel(){
        wizard.reduceHealthLevel(50);
        assertEquals(100, wizard.getHealthLevel());
        wizard.increaseHealth(50);
        assertEquals(150, wizard.getHealthLevel());
    }

    @Test
    public void canAttack(){
        wizard.attack(goblin, fireball);
        assertEquals(30, goblin.getHealthLevel());
    }
}
