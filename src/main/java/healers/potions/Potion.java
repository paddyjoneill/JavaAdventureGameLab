package healers.potions;

public abstract class Potion {

    private String name;
    private int restoreValue;

    public Potion(String name, int restoreValue) {
        this.name = name;
        this.restoreValue = restoreValue;
    }
}
