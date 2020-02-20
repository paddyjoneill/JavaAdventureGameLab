package rooms;

import enemies.Enemy;

public class EnemyRoom extends Room {

    private Enemy enemy;

    public EnemyRoom(String name, Enemy enemy) {
        super(name);
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }


}
