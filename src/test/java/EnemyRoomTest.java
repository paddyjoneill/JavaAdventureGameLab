import enemies.Goblin;
import magicians.Wizard;
import org.junit.Before;
import org.junit.Test;
import rooms.EnemyRoom;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    private EnemyRoom enemyRoom;
    private Goblin goblin;
    private Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Cody the Grey", 100);
        goblin = new Goblin("Graham", 50);
        enemyRoom = new EnemyRoom("dungeon", goblin);
    }

    @Test
    public void hasEnemy(){
        assertEquals(goblin, enemyRoom.getEnemy());
    }

}
