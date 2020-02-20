import healers.Cleric;
import healers.potions.HealthBoostPotion;
import healers.potions.HerbBlast;
import magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    private Cleric cleric;
    private HealthBoostPotion potion;
    private HerbBlast herbs;
    private Wizard wizard;

    @Before
    public void before(){
        cleric = new Cleric("Melinda", 100);
        potion = new HealthBoostPotion("potion", 20);
        herbs = new HerbBlast("herbs", 10);
        wizard = new Wizard("Paul", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Melinda", cleric.getName());
    }

    @Test
    public void hasHealthLevel(){
        assertEquals(100, cleric.getHealthLevel());
    }

    @Test
    public void canAddAndRemovePotions(){
        assertEquals(0, cleric.potionCount());
        cleric.addPotion(potion);
        cleric.addPotion(herbs);
        assertEquals(2, cleric.potionCount());
        cleric.removePotion(potion);
        assertEquals(1, cleric.potionCount());
    }

    @Test
    public void canHeal(){
        cleric.heal(wizard, potion);
        assertEquals(120 ,wizard.getHealthLevel());
        cleric.heal(wizard, herbs);
        assertEquals(130, wizard.getHealthLevel());
    }

}
