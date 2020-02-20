package player;

import treasures.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private String name;
    private int healthLevel;
    private ArrayList<Treasure> treasures;

    public Player(String name, int healthLevel) {
        this.name = name;
        this.healthLevel = healthLevel;
        this.treasures = new ArrayList<Treasure>();
    }

    public String getName() {
        return name;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
