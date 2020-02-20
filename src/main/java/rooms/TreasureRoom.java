package rooms;

import treasures.Treasure;

public class TreasureRoom extends Room {

    private Treasure treasure;

    public TreasureRoom(String name, Treasure treasure) {
        super(name);
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public Treasure giveUpTreasure() {
        Treasure treasureToGiveUp = this.treasure;
        this.treasure = null;
        this.setRoomCompleted();
        return treasureToGiveUp;
    }
}
