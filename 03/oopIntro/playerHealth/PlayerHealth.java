public class PlayerHealth {
    int hp = 100;
    boolean armor = false;
    
    public int getHP() {
        return hp;
    }

    public void setHP(int newHP) {
        hp = newHP;
    }

    public boolean isDead() {
        if(hp <= 0) {
            return true;
        }
        return false;
    }
    
    public boolean isAlive() {
        return !isDead();
    }

    public boolean isOnArmor() {
        return armor;
    }

    public void wearArmor() {
        armor = true;
    }

    public void removeArmor() {
        armor = false;
    }
}
