package rooms;

public abstract class Room {
    private String name;
    private boolean roomCompleted;

    public Room(String name) {
        this.name = name;
        this.roomCompleted = false;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return this.roomCompleted;
    }

    public void setRoomCompleted() {
        this.roomCompleted = true;
    }
}
