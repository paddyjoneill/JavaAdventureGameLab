package fighters;

public class Knight extends Fighter {

    private int armourLevel;

    public Knight(String name, int healthLevel) {
        super(name, healthLevel);
        this.armourLevel = 0;
    }

    public void addArmour(int newArmour){
        this.armourLevel += newArmour;
    }

    public void reduceArmour(int reduceArmourAmount){
        this.armourLevel -= reduceArmourAmount;
    }

    public int getArmourLevel(){
        return this.armourLevel;
    }

    @Override
    public void reduceHealthLevel(int damageLevel){
        if(this.armourLevel == 0){
            super.reduceHealthLevel(damageLevel);
        } else if(this.armourLevel< damageLevel){
            super.reduceHealthLevel(damageLevel-armourLevel);
            armourLevel = 0;
        } else {
            this.reduceArmour(damageLevel);
        }
    }


}
