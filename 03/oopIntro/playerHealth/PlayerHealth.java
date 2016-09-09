public class PlayerHealth {
    int hp = 100;
    
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
}
