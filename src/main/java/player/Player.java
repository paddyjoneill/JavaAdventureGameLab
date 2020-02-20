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

    public void reduceHealthLevel(int amount) {
        this.healthLevel -= amount;
    }

    public void increaseHealth(int amount) {
        this.healthLevel += amount;
    }

    public int treasureCount() {
        return this.treasures.size();
    }

    public void addTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }

    public void removeTreasure(Treasure treasure) {
        this.treasures.remove(treasure);
    }
}
