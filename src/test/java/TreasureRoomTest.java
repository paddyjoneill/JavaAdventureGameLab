import fighters.Knight;
import magicians.Wizard;
import org.junit.Before;
import org.junit.Test;
import rooms.TreasureRoom;
import treasures.Gold;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    private TreasureRoom treasureRoom;
    private Gold gold;
    private Knight knight;

    @Before
    public void before(){
        gold = new Gold("gold", 100);
        treasureRoom = new TreasureRoom("Stephen's Lair", gold);
        knight = new Knight("Sir Kirkington", 100);
    }

    @Test
    public void treasureRoomHasTreasure(){
        assertEquals(gold, treasureRoom.getTreasure());
    }

    @Test
    public void playerCanTakeTreasure(){
        assertEquals(0, knight.treasureCount());
        knight.addTreasure(treasureRoom.giveUpTreasure());
        assertEquals(1, knight.treasureCount());
        assertEquals(null, treasureRoom.getTreasure());
    }

    @Test
    public void onceTreasureTakenRoomIsComplete(){
        knight.addTreasure(treasureRoom.giveUpTreasure());
        assertEquals(true, treasureRoom.isComplete());
    }


}
