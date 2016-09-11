public class PlayerHealth {
    int hp = 100;
    boolean armor = false;
    
    public int getHP() {
        return hp;
    }

    public void setHP(int newHP) {
        hp = newHP;
        checkHpRange();
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
    
    public void getHit() {
        if(isOnArmor()) {
            hp -= 3;
        } else {
            hp -= 10;
        }
        checkHpRange();
    }

    public void checkHpRange() {
        if (hp < 0) {
            hp = 0;
        } else if (hp > 100) {
            hp = 100;
        }
    }
}
