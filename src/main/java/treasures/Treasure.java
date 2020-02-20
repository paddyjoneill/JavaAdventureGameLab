package treasures;

public abstract class Treasure {
    private String name;
    private int treasureValue;

    public Treasure(String name, int treasureValue) {
        this.name = name;
        this.treasureValue = treasureValue;
    }
}
